@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7')

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient


String base = 'http://api.icndb.com'

def chuck = new RESTClient(base)
def params = [firstName: "Dan", lastName: "Vega"]

println chuck.getClass().getName()

chuck.contentType = ContentType.JSON
chuck.get( path: '/jokes/random', query: params ) { response, json ->
    println response.status
    println json
}