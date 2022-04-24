import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_PostsNotZero() {
        val service = WallService()
        val post = Post(
            id = 0,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        service.add(post)
        val result = service.add(post).id
        val notZero: Boolean
        if (result > 0) notZero = true else notZero = false
        assertTrue(notZero)
    }

    @Test
    fun update_postsEquals() {
        val service = WallService()
        val post1 = Post(
            id = 0,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        val post2 = Post(
            id = 1,
            ownerId = 889,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        val post3 = Post(
            id = 2,
            ownerId = 232,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        service.add(post1)
        service.add(post2)
        service.add(post3)

        val update = Post(
            id = 2,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )

        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun update_postsNotEquals() {
        val service = WallService()
        val post1 = Post(
            id = 0,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        val post2 = Post(
            id = 1,
            ownerId = 889,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        val post3 = Post(
            id = 2,
            ownerId = 232,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        service.add(post1)
        service.add(post2)
        service.add(post3)

        val update = Post(
            id = 6,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Post.Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Post.Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Post.Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0,
            postSource = Post.PostSourse(type = "vK", platform = "android", data = "like", uRL = "www.odnoklassniki.ru"),
            geo = Post.Geo(tipe = "city", coordinates = "28.432/6543", geoPlace = Post.Geo.Place(
                id = 56789, title = "Москва", latitude = 45, created = 12092021, icon = "www.cartoons.com", checkins = 5, updated = 22022022, type = 348, country = 0, city = 228, adress = "Россия, Москва, дальше не помню")),
            copyHistory = arrayOf()
        )
        val result = service.update(update)
        assertFalse(result)
    }
}
