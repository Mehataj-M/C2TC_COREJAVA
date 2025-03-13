import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "../App.css";

function CreateDrive() {
  const [drive, setDrive] = useState({
    companyName: "",
    position: "",
    location: "",
    salaryPackage: "",
    driveDate: "",
  });
  const navigate = useNavigate();

  const handleChange = (e) => {
    const { name, value } = e.target;
    setDrive({ ...drive, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .post("http://localhost:3000/placementservice", drive)
      .then((response) => {
        navigate("/");
      })
      .catch((error) => {
        console.error("There was an error creating the drive!", error);
      });
  };

  return (
    <div className="form-container">
      <h2>Create New Placement Drive</h2>
      <form onSubmit={handleSubmit} className="order-form">
        <input
          type="text"
          name="companyName"
          placeholder="Company Name"
          value={drive.companyName}
          onChange={handleChange}
          className="form-input"
          required
        />
        <input
          type="text"
          name="position"
          placeholder="Position"
          value={drive.position}
          onChange={handleChange}
          className="form-input"
          required
        />
        <input
          type="text"
          name="location"
          placeholder="Location"
          value={drive.location}
          onChange={handleChange}
          className="form-input"
          required
        />
        <input
          type="text"
          name="salaryPackage"
          placeholder="Salary Package"
          value={drive.salaryPackage}
          onChange={handleChange}
          className="form-input"
          required
        />
        <input
          type="date"
          name="driveDate"
          placeholder="Drive Date"
          value={drive.driveDate}
          onChange={handleChange}
          className="form-input"
          required
        />
        <button type="submit" className="submit-button">
          Create
        </button>
      </form>
    </div>
  );
}

export default CreateDrive;
