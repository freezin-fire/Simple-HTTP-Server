# Simple-HTTP-Server

## Overview

A simple and barebones HTTP server, written in java.
Uses simple socket programming, and returns date and time upon calling GET method on the server.

## Installation

To install NINO, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/freezin-fire/Simple-HTTP-Server.git
   ```

2. **Compile the source code**:
   ```sh
   javac HTTPServer.java
   ```

## Usage

- **Running the server on a specified port**:
  ```sh
  java HTTPServer.java [port]
  ```
  
- **Example**:
To run the server on port 8080:
  ```sh
  java HTTPServer.java 8080
  ```

### Features

- Prints the client browser and session information in the server console upon connection.
- Sends the server Date and Time information to the client.

## License

This project is released under the MIT License. See `LICENSE` for more details.

Feel free to modify and expand this README section according to your project's specific details and requirements.
