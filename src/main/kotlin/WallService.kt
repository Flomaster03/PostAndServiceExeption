class WallService {

    private var postsArray = emptyArray<Post>()

    fun add(post: Post): Post {
        val changeId = if (postsArray.size != 0) postsArray.last().id + 1 else 1
        val postNext = post.copy(id = changeId)
        postsArray += postNext

        return postsArray.last()
    }

    fun update(post: Post): Boolean {
        var change = false
        for ((index, value) in postsArray.withIndex()) {
            if (value.id != post.id) {
                change = false
                continue
            } else {
                postsArray[index] = value.copy(
                    ownerId = value.ownerId,
                    date = value.date
                )
                change = true
                break
            }
        }
        return change
    }
}
