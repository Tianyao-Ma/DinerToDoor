# InstTakeOut

<p align="center">
<img src="https://img.shields.io/badge/Backend-%20Java | SpringMVC %20-F6922B.svg">
<img src="https://img.shields.io/badge/Frontend-%20 React | AntDesign%20-43dcf2.svg">
<img src="https://img.shields.io/badge/Framework-Spring | node.js %20-ec63a8.svg">
<img src="https://img.shields.io/badge/Database-%20 Spring Hibernate | SQL %20-3de540.svg">
<img src="https://img.shields.io/badge/Deployment-%20AWS EC2%20-DDC7FC.svg">
<img src="https://img.shields.io/badge/Platform-%20Fullstack Web%20-F6F063.svg">
</p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## 🎬 About the project
<p align="justify"> 
  Twitch is very popular. But there is so much contents out there. Sometimes, it can be overwhelming and distracting. If you are a occational gamer like me, and you prefer to save and archive your favorite clips/videos/streams than following a tons of channels and getting millions of notifications a day, then MyTwitchHub is for you! It is a web application allows users to browse, search, and create their own favorite lists of Twitch content in three categories: streams, videos, and clips. For all users, we will reommend top hit games retrieved from Twitch, and for registered users, we will recommend games based on their favorite lists.
  
</p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## :film_strip: Project Demo
<p align="center">
<img src="https://user-images.githubusercontent.com/78308927/130557086-43903742-05e8-4fed-b054-deb8c05b8e63.gif" width="800">
</p>

## 🤖 Tech Stack

* Java
* Java Servlet
* Twitch API
* SQL
* React
* Ant Design 3
* Amazon Web Services

## 📐 Design Doc

<p align="center">
<img src="https://user-images.githubusercontent.com/78308927/130887360-e570d151-acb0-42f4-9051-3721bcbe103e.jpg" width=800>
</p>

## :fire: Key Features

- **RESTful API using Java servlets**.
- **Retrieve real time data through Twitch API and store in MySQL** [[Twitch API]](#twitch-api)
- **Display popular games retrived from Twitch website for all users**.
- **Support three search functionality: by top games, by game name, and through favorited collections**. [[Search Methods]](#search-methods)
- **Registered user can save and collect favorite clips/streams/videos**. [[Favorite Feature]](#set-and-unset-favorite-items)
- **Content-based reommendation system**. [[Recommendation System]](#content-based-recommendation)
- **Minimal, content-focused, and clutter-free frontEnd design**.

## :seedling: For Furture Improvement

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)
## :spiral_notepad: Sample Code
### Twitch API
#### Retrieve real-time data from Twitch using Twitch API

 -  [Twitch API](https://dev.twitch.tv/docs/api/) is a RESTFUL API that lets developers build creative integrations for the broader Twitch community 
 -  For all users, myTwitchHub offers top game display and will allow client to search content by game name, which will fetch data by calling two Twitch APIs: [GetTopGames](https://dev.twitch.tv/docs/api/) and [getGames](https://dev.twitch.tv/docs/api/reference#get-games)
 
```
public class TwitchClient {
   
    // Returns the top x streams based on game ID.
    private List<Item> searchStreams(String gameId, int limit) throws TwitchException {
        List<Item> streams = getItemList(searchTwitch(buildSearchURL(STREAM_SEARCH_URL_TEMPLATE, gameId, limit)));
        for (Item item : streams) {
            item.setType(ItemType.STREAM);
            item.setUrl(TWITCH_BASE_URL + item.getBroadcasterName());
        }
        return streams;
    }

    // Returns the top x clips based on game ID.

    
```
###  Set and Unset Favorite Items
#### Support registered users to save and unsave favorite clips/videos/streams with SQL

```
@WebServlet(name = "FavoriteServlet", urlPatterns = {"/favorite"})

```

### Content Based Recommendation
##### Implement Content-based Recommendation for Twitch Items
  ```

  ```
 




