package observer_pattern.notifier;

import observer_pattern.Observer;
import observer_pattern.Subject;
import observer_pattern.VideoData;

public class FacebookNotifier extends Observer {
    public FacebookNotifier(Subject subject){
        this.subject = subject;
        this.subject.attachObserver(this);
    }
    @Override
    public void notify(Subject subject, Object arg) {
        if(subject instanceof VideoData videoData){
            System.out.printf("Notify all subscribers via FACEBOOK with new data"+
                    "\n\t Name: %s"+
                    "\n\t Description: %s"+
                    "\n\t File name: %s\n", videoData.getTitle(), videoData.getDescription(), videoData.getFileName()
            );
        }
    }
}
