data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val viewsCount: Int,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int,
    val postSource: PostSourse?,
    val geo: Geo?,
    val copyHistory: Array<Reposts>?,
    val attachments: Array<Attachment>?,
    val comment: Comment
) {
    data class Comments(
        val count: Int,
        val canPost: Boolean,
        val groupsCanPost: Boolean,
        val canClose: Boolean,
        val canOpen: Boolean
    )

    data class Reposts(
        val count: Int,
        val userReposted: Boolean
    )

    data class Likes(
        val count: Int,
        val userLikes: Boolean,
        val canLike: Boolean,
        val canPublish: Boolean
    )

    data class PostSourse(
        val type: String,
        val platform: String,
        val data: String,
        val uRL: String
    )

    data class Geo(
        val tipe: String,
        val coordinates: String,
        val geoPlace: Place
    ) {
        data class Place(
            val id: Int,
            val title: String,
            val latitude: Int,
            val created: Int,
            val icon: String,
            val checkins: Int,
            val updated: Int,
            val type: Int,
            val country: Int,
            val city: Int,
            val adress: String
        )
    }

    data class Comment(
        val ownerId: Int,
        val postId: Int,
        val fromGroup: Boolean,
        val message: String,
        val replyToComment: Int,
        val attachments: String,
        val stickerId: Int,
        val guid: String
    )
}
