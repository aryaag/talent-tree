# API Specifications

## Users

**GET** `/users?skill=&level=&location=&certfied=&limit=`

Gets filterable list of all users

**GET** `/user/{id}?self=`

Gets user profile of single user (*self* flag can be set to true when fetching own profile)

**PUT** `/user/certify`

Initiates a _certify_ request for current user's skill level. *(Request body: user_id, skill_id, level)*

## Skills

**GET** `/skills`

Gets all skills (IDs and names)

**GET** `/skill/{id}`

Gets all info regarding particular skill _(Note: can have an optional query param to return only specific data)_

:warning: Routes below this need revisiting

**POST/PUT/DELETE** `/skill/{skill_id}/{level}/{user_id}`

Creates, edits or deletes a particular skill for a user