import React, { useState } from 'react';

const BooleanStateComponent = () => {
  // Using boolean for state
  const [isActive, setIsActive] = useState(true);

  const touch = () => {
    // Toggle the boolean state
    setIsActive(!isActive);
  };

  return (
    <div>
      <h1>Boolean State Component</h1>
      <p>Component is {isActive ? 'active' : 'inactive'}</p>
      <button onClick={touch}>
        {isActive ? 'Deactivate' : 'Activate'}
      </button>
    </div>
  );
};

export default BooleanStateComponent;
