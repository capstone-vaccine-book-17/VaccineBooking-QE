package starter.Projects;

import com.google.gson.JsonObject;
import org.json.simple.JSONObject;

public class register {

    private String url, body;

    public void setUrlregister() { url = "http://ec2-100-26-203-215.compute-1.amazonaws.com/signup";}

    public JSONObject input(){
        JSONObject body = new JSONObject();
        body.put("nama", "{string}");
        body.put("nik", "{string}");
        body.put("dob", "{string}");
        body.put("alamat", "{string}");
        body.put("email", "{string}");
        body.put("gemder", "{string}");
        body.put("password", "{string}");
        return body;
    }
}
