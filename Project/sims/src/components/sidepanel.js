import React from 'react';
import 'C:/Users/senth/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/css/sidepanel.css';
const SidePanel=()=>
{
    return(
        <>
        
  <div class="sidebar_menu">

{/* <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'> */}
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'/>
    
    <div class="Logo">
    <i class='bx bxl-slack icon'></i>
      
      <i class='bx bx-menu' id="Button" ></i>
    </div>


  <ul class="Nav_Item">
      <li>
          <i class='bx bx-search' ></i>
        <input type="text" placeholder="Search...."/>
        <span class="Menu_btn">Search</span>
      </li>

    <li>
    <a href="#">
      <i class='bx bx-grid-alt'></i>
      <span class="Item_Name">Dashboard</span>
    </a>
      <span class="Menu_btn">Dashboard</span>
    </li>
  
    <li>
    <a href="#">
      <i class='bx bx-user'></i>
      <span class="Item_Name">People</span>
    </a>
    <span class="Menu_btn">People</span>
    </li>

    <li>
    <a href="#">
    <i class='bx bxs-star-half'></i>
    <span class="Item_Name">favorites</span>
    </a>
    <span class="Menu_btn">favorites</span>
    </li>

  <li>
    <a href="#">
    <i class='bx bx-trip'></i>
    <span class="Item_Name">Workflows</span>
    </a>
    <span class="Menu_btn">Workflows</span>
  </li>

  <li>
    <a href="#">
    <i class='bx bx-volume-low'></i>
      <span class="Item_Name">Updates</span>
    </a>
    <span class="Menu_btn">Updates</span>
    </li>

  <li>
    <a href="#">
    <i class='bx bxs-extension'></i>
    <span class="Item_Name">Plug-ins</span>
    </a>
    <span class="Menu_btn">Plug-ins</span>
    </li>

    <li>
    <a href="#">
    <i class='bx bx-bell'></i>
    <span class="Item_Name">Notifications</span>
    </a>
    <span class="Menu_btn">Notifications</span>
    </li>

    <li class="Details">
      <div class="Child_Details">
      <img src="sk.jpg" alt=""/>
      <div class="Name_Roll">
      <div class="Name">Suraj kumar</div>
      <div class="Roll">Developer</div>
      </div>
      </div>
      <i class='bx bxs-info-circle' id="log_out" ></i>
      </li>
</ul>

</div>
<script>

</script>
            </>
    )
}
export default SidePanel;