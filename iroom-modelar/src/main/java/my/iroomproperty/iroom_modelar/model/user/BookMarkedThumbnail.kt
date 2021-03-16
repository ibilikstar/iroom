package my.iroomproperty.iroom_modelar.model.user

/**
 * @project
 * @author Mahdi Giveie<mahdico@gmail.com>
 */
class BookMarkedThumbnail {

    var mBookmarkId = "";
    var mBookmarkImage = "";
    var mBookmarkTitle = "";
    var mBookmarkAddress = "";

    constructor(
        mBookmarkId:String,
        bookmarkimage:String,
        bookmarktitle:String,
        bookmarkaddress:String
    ){
        this.mBookmarkId = mBookmarkId;
        this.mBookmarkImage = bookmarkimage;
        this.mBookmarkAddress = bookmarkaddress;
        this.mBookmarkTitle = bookmarktitle;
    }
}