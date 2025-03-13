// DriveList.js
import React, { useState, useEffect } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import "../App.css";  

function DriveList() {
  const [drives, setDrives] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:3000/drives")
      .then((response) => {
        setDrives(response.data);
      })
      .catch((error) => {
        console.error("There was an error fetching the drives!", error);
      });
  }, []);

  return (
    <div className="table-container">
      <h2>Drive List</h2>
      <Link to="/create-drive">Create New Drive</Link>
      <table>
        <thead>
          <tr>
            <th>Drive ID</th>
            <th>Drive Name</th>
            <th>Date</th>
            <th>Location</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {drives.map((drive) => (
            <tr key={drive.driveId}>
              <td>{drive.driveId}</td>
              <td>{drive.name}</td>
              <td>{drive.date}</td>
              <td>{drive.location}</td>
              <td>
                <Link to={`/update-drive/${drive.driveId}`}>✏️Edit</Link>
                {" | "}
                <Link to={`/delete-drive/${drive.driveId}`}>🗑️Delete</Link>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default DriveList;