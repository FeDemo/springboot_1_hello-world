# springboot_1_helloword
springboot demo

>hello world  

```
@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping({ "/", "/index" ,""})
	public String index(){
		return "hello springboot";
	}

	@RequestMapping("json")
	public Map json(){
		Map m=new HashMap();
		m.put("index1","str1");
		m.put("index2","str2");
		m.put("index3","str3");
		return m;
	}
}
```
>index  

![](https://raw.githubusercontent.com/FeDemo/springboot_1_helloword/master/imgs/1.png)

>json   

![](https://raw.githubusercontent.com/FeDemo/springboot_1_helloword/master/imgs/2.png)
