#1.获取code
http://localhost:8000/oauth/authorize?client_id=client&response_type=code

#2.code换token
postman
http://client:secret@localhost:8000/oauth/token
x-www-form-urlencoded
grant_type:authorization_code
code:code

curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'grant_type=authorization_code&code=1JuO6V' "http://client:secret@localhost:8080/oauth/token"

#3.携带token访问资源服务器
http://127.0.0.1:8001/contents/?access_token=xx

