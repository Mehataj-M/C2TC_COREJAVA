// UpdateDrive.js
import React, { useState, useEffect } from "react";
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import "../App.css";  

function UpdateDrive() {
  const { id } = useParams();
  const [drive, setDrive] = useState({ name: "", date: "", location: "" });
  const navigate = useNavigate();

  useEffect(() => {
    axios
      .get(`http://localhost:3000/drives/${id}`)
      .then((response) => {
        setDrive(response.data);
      })
      .catch((error) => {
        console.error("There was an error fetching the drive details!", error);
      });
  }, [id]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setDrive({ ...drive, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .put(`http://localhost:8080/drives/${id}`, drive)
      .then(() => {
        navigate("/");
      })
      .catch((error) => {
        console.error("There was an error updating the drive!", error);
      });
  };

  return (
    <div className="update-form-container">
      <h2>Update Drive</h2>
      <form onSubmit={handleSubmit}>
        <input type="text" name="name" placeholder="Drive Name" value={drive.name} onChange={handleChange} />
        <input type="date" name="date" value={drive.date} onChange={handleChange} />
        <input type="text" name="location" placeholder="Location" value={drive.location} onChange={handleChange} />
        <button type="submit">Update</button>
      </form>
    </div>
  );
}

export default UpdateDrive;
