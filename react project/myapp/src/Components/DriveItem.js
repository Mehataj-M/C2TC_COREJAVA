import React from "react";
import "../App.css";  

function DriveItem({ drive }) {
  return (
    <tr>
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
  );
}

export default DriveItem;