package test.com.amal.jms.listner;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import org.junit.After;
import org.junit.Before;
import static org.easymock.EasyMock.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amal.jms.listener.ConsumerListener;

public class ConsumerListenerTest {

	private TextMessage message;
	private ConsumerListener listener;
	private ApplicationContext context;
	private String json = "{vendorName:\"Microsofttest3\",firstName:\"BobTest3\",lastName:\"SmithTest3\",address:\"123 Main test3\",city:\"TulsaTest3\",state:\"OKTest3\",zip:\"71345Test3\",email:\"Bob@microsoft.test3\",phoneNumber:\"test-123-3333\"}";

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("/spring/application-config.xml");
		listener = (ConsumerListener) context.getBean("consumerListener"); 
		message = createMock(TextMessage.class);
	}

	@After
	public void tearDown() throws Exception {
		((ConfigurableApplicationContext) context).close();
	}

	@Test
	public void testOnMessage() {
		try {
			expect(message.getText()).andReturn(json);
		} catch (JMSException e) {
			e.printStackTrace();
		}
		replay(message);
		listener.onMessage(message);
		verify(message);
	}

}
