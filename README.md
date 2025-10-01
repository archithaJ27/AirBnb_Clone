<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
</head>
<body>

  <h1>AirbnbClone Spring Boot Application</h1>

  <p>
    An Airbnb-like booking platform built with Spring Boot, providing RESTful APIs for managing hotels, rooms, bookings, guests, and payments. Secure, scalable, and integrated with Stripe and JWT-based authentication.
  </p>

  <hr />

<h2>Features</h2>
  <ul>
    <li>Hotel and Room Management (CRUD, activation, reporting)</li>
    <li>Booking Management (create, update, cancel, add guests)</li>
    <li>Guest Management</li>
    <li>Payment Processing via Stripe webhook</li>
    <li>User Authentication & Authorization (JWT)</li>
    <li>Search and browsing hotels</li>
    <li>Dynamic inventory management with surge pricing</li>
    <li>Hotel reports and analytics</li>
  </ul>

  <hr />

<h2>Technologies &amp; Dependencies</h2>
  <ul>
    <li><strong>Spring Boot 3.5.6</strong></li>
    <li><strong>Spring Data JPA</strong> (MySQL database integration)</li>
    <li><strong>Spring Security</strong>, JWT, and OAuth2 for authentication</li>
    <li><strong>MySQL Database</strong></li>
    <li><strong>Stripe API</strong> for payment processing</li>
    <li><strong>SpringDoc OpenAPI</strong> for API documentation</li>
    <li><strong>Lombok</strong> for boilerplate reduction</li>
    <li><strong>ModelMapper</strong> for object mapping</li>
    <li>JUnit &amp; Spring Boot Starter Test for testing</li>
  </ul>
  <p>Refer to the <code>pom.xml</code> for complete dependency details.</p>

  <hr />

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
  <ul>
    <li>Java 21 or later</li>
    <li>MySQL database setup and running</li>
    <li>Maven</li>
  </ul>

<h3>Setup Instructions</h3>
  <ol>
    <li>
      Clone the repository:<br/>
      <code>git clone &lt;YOUR_REPO_URL&gt;</code>
    </li>
    <li>
      Configure your application:<br/>
      Edit <code>application.properties</code> (or <code>application.yml</code>) to set your MySQL database credentials and other environment variables.
    </li>
    <li>
      Build the project:<br/>
      <code>mvn clean install</code>
    </li>
    <li>
      Run the application:<br/>
      <code>mvn spring-boot:run</code><br/>
      Default server URL: <a href="http://localhost:8080/api/v1">http://localhost:8080/api/v1</a>
    </li>
  </ol>

<h3>Environment Variables</h3>
  <p>
    Ensure your environment provides necessary secrets for JWT, Stripe, etc., as per your application configuration.
  </p>

  <hr />

<h2>API Documentation</h2>
  <p>
    This project integrates <strong>SpringDoc OpenAPI-UI</strong>. Once the app runs, access the API docs at:<br/>
    <a href="http://localhost:8080/api/v1/swagger-ui.html">http://localhost:8080/api/v1/swagger-ui.html</a>
  </p>
  <p>You can explore all endpoints, request/response schemas, and try API calls directly.</p>

<h3>Sample Endpoints</h3>
  <ul>
    <li><code>/auth/login</code>, <code>/auth/signup</code> - User authentication</li>
    <li><code>/admin/hotels</code>, <code>/hotels/search</code> - Hotel management and search</li>
    <li><code>/bookings/init</code>, <code>/bookings/{bookingId}/addGuests</code> - Booking flow</li>
    <li><code>/webhook/payment</code> - Payment webhook</li>
    <li><code>/users/profile</code> - User profile management</li>
  </ul>

  <hr />

<h2>Security</h2>
  <ul>
    <li>JWT tokens are used for securing endpoints.</li>
    <li>Stripe webhook validates payments.</li>
    <li>Endpoints are role-based secured.</li>
  </ul>

  <hr />

<h2>Contributing</h2>
  <p>
    Contributions are welcome! Please fork the repository, create a feature branch, and submit a pull request.
  </p>

  <hr />

<h2>License</h2>
  <p>
    This project is for educational and demo purposes. Please customize license details as needed.
  </p>

</body>
</html>
