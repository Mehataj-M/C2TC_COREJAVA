import React from "react";
import "./App.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import CreateDrive from "./Components/CreateDrive";
import UpdateDrive from "./Components/UpdateDrive";
import DriveList from "./Components/DriveList";
import DeleteDrive from "./Components/DeleteDrive";
import DriveItem from "./Components/DriveItem";

function App() {
  return (
    <Router>
      <div className="App">
        <h1>Placement Drive Management</h1>
        <nav>
          <a href="/">Home</a>
        </nav>
        <div className="page-container">
          <Routes>
            <Route path="/" element={<DriveList />} />
            <Route path="/create" element={<CreateDrive />} />
            <Route path="/update/:id" element={<UpdateDrive />} />
            <Route path="/delete/:id" element={<DeleteDrive />} />
            <Route path="/drive/:id" element={<DriveItem />} />
          </Routes>
        </div>
      </div>
    </Router>
  );
}

export default App;