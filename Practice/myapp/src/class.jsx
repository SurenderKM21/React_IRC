import React,{Component} from 'react';


const Disp = () => {
  // Sample list of items
  const lis = [
1,32,'c','b'
  ]
  const num=[1,2,3,4,6]
  const z = num.map((item)=><li>{item}</li>);
  
  return (
    <>
    <ul>
        {num.map((item) =>(
            <li>{item*2}</li>
        ))}
    </ul>
    <ul>
      {lis.map((item) => (
          // Each item should have a unique "key" prop
          <li >{item}</li>
          ))}
    </ul>
          </>
  );
};

export default Disp;
