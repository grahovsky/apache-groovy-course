
def log = { String type, Date createdOn, String msg -> 
    println "$createdOn [$type] - $msg"
}

log("DEBUG",new Date(),"This is my first debug statement...")

def debugLog = log.curry("DEBUG")
println debugLog.getClass()
//class org.codehaus.groovy.runtime.CurriedClosure
debugLog(new Date(), "This is another debug statement...")
//Tue Jul 14 22:20:09 MSK 2020 [DEBUG] - This is another debug statement...
debugLog(new Date(), "This is one more...")
//Tue Jul 14 22:20:09 MSK 2020 [DEBUG] - This is one more...

def todayDebugLog = log.curry("DEBUG",new Date())
todayDebugLog("This is today's debug msg")
//Tue Jul 14 22:20:53 MSK 2020 [DEBUG] - This is today's debug msg

// right curry
def crazyPersonLog = log.rcurry("Why am I logging this way")
crazyPersonLog("ERROR",new Date())
//Tue Jul 14 22:20:53 MSK 2020 [ERROR] - Why am I logging this way

// index based currying
def typeMsgLog = log.ncurry(1,new Date())
typeMsgLog("ERROR","This is using ncurry...")
//Tue Jul 14 22:20:53 MSK 2020 [ERROR] - This is using ncurry...