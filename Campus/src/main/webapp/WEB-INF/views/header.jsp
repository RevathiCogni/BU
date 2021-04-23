<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Campus Recruitment System</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"> </script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"> </script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css" />

</head>
<body class="home">

<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
  <div class="container">
    <a class="navbar-brand" href="#"><img src="images/OIP.jpg" height="70px" width="150px"></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Home
                
              </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/addPlacement">Add Placement</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/viewPlacements">Placements</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/otherPlacements">Other Placements</a>
        </li>
        <li class="nav-item">
        	<a class="nav-link profile1" href="/logout">Logout</a>
          <img src="/images/admin.png" class="rounded-circle profile" width="40px" height="35px" />
          <div class="btn-group">
            <button type="button" style="border : 0px;" class="dropdown-toggle profile" data-toggle="dropdown">
                Name
            </button>
          <div class="dropdown-menu profile">
                <div class="dropdown-header">Profile</div>
                <a class="dropdown-item" href="#">Manage Profile</a>
                <a class="dropdown-item" href="/logout">Logout</a>
                </div>
          </div>
        </li>
      </ul>
    </div>
  </div>
</nav>

</body>
</html>

