# MissSecret

1. what is the proposed name for your Web Application?
    - MissSecret
2. Who is the target audience for your Web Application?
    - Single men and women having hard time to find a perfect match in the modern world.
3. What problem is it intended to solve for the target audience?
    - In modern socety, people are either too aggressive or rash while building up a close relationship with others, which always results in bad dating experience and waste of time. Traditional model of dating apps is becoming boring and sometimes annoying due to the failure of visitor management and privacy protection. I will provide a way to help people better understand each other even before they chat online. Users will have complete control of his privacy.
4. How will it meet the minimum project requirement?
    - Most of the content of my site will be accessible without a login. Visitors will be able to view the avatars and the main page. A login or account creation will be required if they want to interact with other users. OAuth2 authentication is supported for users want to connect with other social accounts. Users will have access to other's personal information only when others give out the permission. Public data will be accessibe through RESTful services. All RESTful service will data in both JSON and XML formats.
5. Why is your proposed Web Application unique or creative beyond simply meeting the minimum requirements?
    - My site will allow users to post a series of customized question based on their own interest, and they can determine which user could gain the access to their personal files based on the answers. Since men is more aggressive than women in building a relationship, the interactive experience will be totally different. Female user will tend to make up puzzels, while male users will tend to solve them. I'll track site usage and interaction with others by posting the most interesting puzzels made by users.

## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-DukeCode.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-DukeCode)

## Web Site

[MissSecret](https://jin-first-2017.herokuapp.com)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.