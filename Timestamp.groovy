def now = new Date().format("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
message.setHeader("X-Timestamp", now)
return message
