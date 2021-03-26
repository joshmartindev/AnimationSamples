package com.joshmartindev.animationsamples

import com.joshmartindev.animationsamples.models.BlogPost
/*
 * This is a dummy data source.
 * The content used was taken from popular blog posts on hashnode.com.
 * If a particular blog post interests you, I encourage you to look the creator up
 * by username which is provided in each BlogPost object.
 * --@joshmartindev
 */
class DataSource {
    companion object {
        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "5 Excellent Reasons Why You Should Be Developing Games",
                    "I’m not your typical game developer. I’m in my thirties, never had any " +
                            "formal coding training, and my main job title is mom. So why am I pursuing gam...",
                    "https://cdn.hashnode.com/res/hashnode/image/upload/v1616618604619/heHOop32d.png",
                    "@tarynwritescode"
                )
            )
            list.add(
                BlogPost(
                    "MITM (Man-In-The-Middle) Attacks and Prevension",
                    "Learn how man-in-the-middle (MITM) attacks can put your website users in " +
                            "danger and how to prevent it. You can read the original article here. What ar...",
                    "https://cdn.hashnode.com/res/hashnode/image/upload/v1616558100415/qybsrsMlB.jpeg",
                    "@teoselenius"
                )
            )
            list.add(
                BlogPost(
                    "Life at Hashnode #1: Curtain Up!",
                    "Hey! Everyone You have seen my Hashnode team and me talking to you over " +
                            "the Discord server, Tweets, Hashnode comments, everywhere and anywhere. Bu...",
                    "https://cdn.hashnode.com/res/hashnode/image/upload/v1616651809772/1EVqi7kxn.png",
                    "@learnwithmegha"
                )
            )
            list.add(
                BlogPost(
                    "You Can Create These Elements Without Javascript",
                    "We've got used to writing JavaScript for common UI element functionality " +
                            "like accordions, tooltips, text truncation, etc. But as HTML and CSS got new...",
                    "https://cdn.hashnode.com/res/hashnode/image/upload/v1616654685706/6RkV7SpJX.jpeg",
                    "@codeAdrian"
                )
            )
            return list
        }
    }
}