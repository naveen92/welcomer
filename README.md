# welcomer
This repo is to demonstrate Test Driven Development (TDD) using a project that welcomes a user if they login.

## User Stories
1. Login page redirection
	As a user, I will be redirected to login page if accessed "/" without previously logged in.

2. HTTP 200 response for "/login" end-point
	As a user, I will be able to get /login page with form to enter credentials for login.

3. Show home page after login
	As a user, I should get home page ("/") with user welcome message once login is successful with correct credentials.

4. Show login page again on incorrect user credentials
	As a user, I should get login page back again with proper error message when login is unsuccessful upon incorrect input credentials.

5. HTTP 200 for /logout if user logged in
	As a user, I should get login page back when accessed /logout URL end-point.
