import React from 'react'

import { useNavigate } from 'react-router-dom'
import 'C:/Users/senth/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/css/register.css'
// import 'C:/Users/senth/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/css/register.css'
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
  
        <input type="text" placeholder="Username" id="uname" required/>
        <input type="password" placeholder="Password" id="pass" required/>
        <button type="submit" >Login</button>
        
</div>
    </form>        
   </div> 
</>
    )
}

export default Login