package basics1;

public class TestMobile {
	public static void main(String[] args)
	ClassPathResource resource=new ClassPathResource ("ioc1.xml") ;
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Mobile mobile=(Mobile) beanFactory.getBean("mymobile")
			mobile.musicPlayer();
}

}
