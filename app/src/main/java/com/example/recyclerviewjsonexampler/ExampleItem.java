package com.example.recyclerviewjsonexampler;

public class ExampleItem {

    private String mImageUrl;
    private String mCreators;
    private int mLikes;


    public ExampleItem(String imageUrl,String creator,int likes)

    {
        mImageUrl=imageUrl;
        mCreators= creator;
        mLikes = likes;

    }

   public String getImageUrl()
   {
        return mImageUrl;

   }

   public String getCreators(){
        return mCreators;
   }

   public  int getLikesCount()
   {
        return mLikes;
   }
}


