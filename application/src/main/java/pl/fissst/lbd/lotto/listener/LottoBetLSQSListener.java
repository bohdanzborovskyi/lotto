package pl.fissst.lbd.lotto.listener;

import com.jashmore.sqs.argument.payload.Payload;
import com.jashmore.sqs.spring.container.basic.QueueListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class LottoBetLSQSListener
{

    Logger logger = Logger.getLogger(this.getClass().getName());

    @QueueListener("lotto.bet")
    public void processMessage(@Payload final String payload)
    {
        logger.info("Listener received message: " + payload);
    }


}
