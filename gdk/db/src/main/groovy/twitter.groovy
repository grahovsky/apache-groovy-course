import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = "twitter"
String password = "password"

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/twitter?useUnicode=true&serverTimezone=UTC", username, password, "com.mysql.cj.jdbc.Driver")

// create schema
sql.execute('DROP TABLE IF EXISTS users')
sql.execute '''
CREATE TABLE users (
      id INT NOT NULL,
      username VARCHAR(45) NOT NULL,
      bio VARCHAR(45) NULL,
      PRIMARY KEY (id)
  );
'''

// create some data
sql.execute '''
    INSERT INTO users (id,username,bio) VALUES (1,'therealdanvega','Programmer.Blogger.YouTuber.Teacher.')
'''

def twitterUser = [id:2,username:'foo',bio:'foo']

sql.execute """
  INSERT INTO users (id,username,bio)
  VALUES
  (${twitterUser.id},${twitterUser.username},${twitterUser.bio})
"""


//List<GroovyRowResult> rows = sql.rows("select * from users")
//println rows

//sql.eachRow('select * from users') { row ->
//    println "Tweet: @${row.username}"
//}

// create a new fileto hold our users in and put in the header values
def file = new File('twitter.csv')
file.write("id,usernsame,bio\n")

sql.eachRow('select * from users') { row ->
    file.append("${row.id},${row.username},${row.bio}\n")
}


// calling close manually
sql.close()
println "Completed!"
