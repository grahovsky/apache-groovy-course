//
//def xml = '''
//    <sports>
//        <sport>
//            <name>Football</name>
//        </sport>
//    </sports>
//'''
//
//def sports = new XmlSlurper().parseText(xml)
//
//println sports.getClass().getName()
////groovy.util.slurpersupport.NodeChild
//println sports.sport.name
////Football

import groovy.xml.XmlSlurper
import groovy.xml.XmlUtil

def sports = new XmlSlurper().parse('data/sports.xml')

println sports

println sports.sport[2].name
println sports.sport[2].@id

println XmlUtil.serialize(sports)