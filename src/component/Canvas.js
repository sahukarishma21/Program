import React, { useState } from "react";
import './Canvas.css';
const CanvasComponent = () => {
  const [char, setChar] = useState("A");

  const handleDownload = () => {
    const canvas = document.getElementById("canvas");
    const ctx = canvas.getContext("2d");

    // Get the pixel color data
    const pixelData = ctx.getImageData(0, 0, 16, 34).data;

    // Convert pixel data to hex format
    let hexData = "";
    for (let i = 0; i < pixelData.length; i += 4) {
      const r = pixelData[i].toString(16).padStart(2, "0");
      const g = pixelData[i + 1].toString(16).padStart(2, "0");
      const b = pixelData[i + 2].toString(16).padStart(2, "0");
      hexData += `#${r}${g}${b}\n`;
    }

    // Create a Blob with the pixel data
    const blob = new Blob([hexData], { type: "text/plain" });

    // Create a URL for the Blob
    const url = URL.createObjectURL(blob);

    // Create a download link
    const a = document.createElement("a");
    a.href = url;
    a.download = "canvas_pixel_data.txt";
    a.click();
  };

  return (
    <div className="text">
      <canvas id="canvas" width="16" height="34"></canvas>
      <div style={{ textAlign: "center" }}>{char}</div>
      <a href="#" onClick={handleDownload}>Download</a>
    </div>
  );
};

export default CanvasComponent;
