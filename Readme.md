
# Url Shortener Project

This is a simple url shortener project which is using in-memory db.

- Spring Boot
- Exception Handling
- Validation
- H2 Database
- Deploying to Heroku

## View Herouku App

https://java-url-shortener.herokuapp.com/

- #### Get all urls

```http
  GET /all
```
#### Response:
```javascript
[
    {
        "id": 1,
        "url": "https://github.com/RzayevTaleh01",
        "code": "GIT"
    },
    {
        "id": 2,
        "url": "https://www.linkedin.com/in/rzayevtaleh01/",
        "code": "Linkedin"
    }
]
```
##

- #### Redirect

```http
  GET /{code}
```
You will be redirected to the URL of the code.

##

- #### Show Url of Code (alias)

```http
  GET /show/{code}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `code`      | `string` | **Required**. Code of url to fetch |

#### Response:
```javascript
{
    "id": 1,
    "url": "https://github.com/RzayevTaleh01",
    "code": "GIT"
}
```
##

- #### Create Short Url

```http
  POST /
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `url`      | `string` | **Required**. Code of url to fetch |
| `code`      | `string` | **Not Required**. If it is null or empty, it will be created automatically. |

#### Request:
```javascript
{
    "url": "https://github.com/RzayevTaleh01",
    "code": "git"
}
```

#### Response:
```javascript
{
    "id": 3,
    "url": "https://github.com/RzayevTaleh01",
    "code": "GIT"
}
```

## Installation


```bash
   git clone https://github.com/RzayevTaleh01/Java_UrlShortener_Project.git
```
    
