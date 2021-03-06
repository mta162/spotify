package spotify;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@Tag("audio")
public class AudioPlayer extends Component {

    public AudioPlayer(){
    	//getElement().getStyle().set("margin", "0px");
    	//getElement().getStyle().set("padding", "0px");
    	getElement().getStyle().set("width", "100%");
    	getElement().getStyle().set("align-self", "center");
    	//getElement().getStyle().set("height", "100%");
    	
        getElement().setAttribute("controls",true);
        getElement().setProperty("src",null);
    }

    public  void setSource(String path){
        getElement().setProperty("src",path);
    }
}
