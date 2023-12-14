import React from 'react'
import { useNavigate } from 'react-router-dom'
import 'C:/Users/senth/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/css/login.css'
const   Login = () => {
    const navigate = useNavigate();
    const Hom=()=>
    {
        navigate("/")
    }
    return (
        <>
        <div id="entire" >
        <form onSubmit={Hom}>
<div id="wrap">
        <h1>LOGIN</h1>
  <div class="entryarea">
        <input type="text"  placeholder="Username" required/>
        {/* <div class="labeline" >Username</div> */}
  </div>
  <div class="entryarea">
        <input type="password" placeholder='Password' id="pass" required/>
        {/* <div class="labeline">Password</div> */}
  </div>
 
        <button type="submit" >Login</button>
        
</div>
    </form>        
   </div> 
</>
    )
}

export default Login