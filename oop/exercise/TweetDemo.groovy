@groovy.transform.Canonical
class Tweet {

    String post
    String username
    Date postDateTime
    
    private List favorites = []
    private List retweets = []
    private List mentions = []
    private List hashtags = []
    
    void favorite(String username) {
        favorites << username
    }
    
    List getFavorites(){
        favorites
    }
    
    void retweet(String username){
        retweets << username
    }
    
    List getRetweets(){
        retweets
    }
    
    List getMentions(){
        String pattern = /\B@[a-z0-9_-]+/
        post.findAll(pattern)
    }
    
    List getHashTags(){
//        String pattern = /(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
//        post.findAll(pattern)
        
        //my implementation
        def matches = post =~ /(?:\s|\A)([#][A-Za-z0-9-_]+)/
        def list = []
        matches.each{ list << it}
        return list
        
    }

}

Tweet tweet = new Tweet(post: "This Groovy Course by @therealdanvega is awesome! #Java #groovylang", username:"@therealdanvega", postDateTime: new Date() )
println tweet
//Tweet(This Groovy Course by @therealdanvega is awesome! #Java #groovylang, @therealdanvega, Sat Jul 18 20:53:12 MSK 2020, [], [], [], [ #Java,  #groovylang])

tweet.favorite("@ApacheGroovy_favorite")
tweet.retweet("@ApacheGroovy_retweet")

println tweet.getFavorites()
//[@ApacheGroovy_favorite]
println tweet.getRetweets()
//[@ApacheGroovy_retweet]

println tweet.getMentions()
//[@therealdanvega]
println tweet.getHashTags()
//[ #Java,  #groovylang]
// my implementation [[ #Java, Java], [ #groovylang, groovylang]]