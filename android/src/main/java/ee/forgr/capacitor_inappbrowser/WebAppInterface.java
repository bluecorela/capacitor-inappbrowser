package ee.forgr.capacitor_inappbrowser;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

import com.getcapacitor.JSObject;

import org.json.JSONException;
import org.json.JSONObject;

public class WebAppInterface {
    Context mContext;
    Options options;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c, Options options) {
        mContext = c;
        this.options = options;
    }

    /** Handle message from web page */
    @JavascriptInterface
    public void handleMessage(String message) {
        // Handle the received message here
        Log.d("WebAppInterface", "Received message: " + message);
        // Parse the JSON and handle accordingly
        try {
            JSObject json = new JSObject(message);
            //String action = json.getString("action");
            this.options.getCallbacks().messageReceived(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
