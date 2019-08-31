参见：https://blog.csdn.net/niuch1029291561/article/details/80938095
### 日志级别 ###

OFF 	    为最高等级 关闭了日志信息  
FATAL  	为可能导致应用中止的严重事件错误  
ERROR        为严重错误 主要是程序的错误  
WARN 	为一般警告，比如session丢失  
INFO 	  为一般要显示的信息，比如登录登出  
DEBUG       为程序的调试信息  
TRACE        为比DEBUG更细粒度的事件信息  
ALL 	     为最低等级，将打开所有级别的日志

Log4j建议使用ERROR，WARN，INFO，DEBUG四种级别

### 输出格式 ###


Log4J最常用的日志输出格式为：org.apache.log4j.PatternLayOut，其主要参数为：

    %n - 换行
    %m - 日志内容
    %p - 日志级别(FATAL， ERROR，WARN， INFO，DEBUG or custom)
    %r - 程序启动到现在的毫秒数
    %t - 当前线程名
    %d - 日期和时间, 一般使用格式 %d{yyyy-MM-dd HH:mm:ss， SSS}
    %l - 输出日志事件的发生位置， 同 %F%L%C%M
    %F - java 源文件名
    %L - java 源码行数
    %C - java 类名，%C{1} 输出最后一个元素
    %M - java 方法名
