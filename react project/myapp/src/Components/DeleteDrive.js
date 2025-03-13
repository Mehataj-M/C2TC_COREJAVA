// DeleteDrive.js
import React, { useState, useEffect } from "react";
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import "../App.css";  

function DeleteDrive() {
  const { id } = useParams();
  const [showConfirm, setShowConfirm] = useState(false);
  const navigate = useNavigate();

  useEffect(() => {
    setShowConfirm(true);
  }, [id]);

  const handleDelete = () => {
    axios
      .delete(`http://localhost:3000/drives/${id}`)
      .then(() => {
        navigate("/");
      })
      .catch((error) => {
        console.error("There was an error deleting the drive!", error);
      });
  };

  return (
    <div className="delete-container">
      {showConfirm ? (
        <div className="confirmation-dialog">
          <h2>Are you sure you want to delete this drive?</h2>
          <button className="confirm-button" onClick={handleDelete}>Yes, Delete</button>
          <button className="cancel-button" onClick={() => navigate("/")}>Cancel</button>
        </div>
      ) : (
        <h2>Deleting Drive...</h2>
      )}
    </div>
  );
}

export default DeleteDrive;