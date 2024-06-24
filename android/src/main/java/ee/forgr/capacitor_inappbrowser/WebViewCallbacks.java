package ee.forgr.capacitor_inappbrowser;

import com.getcapacitor.JSObject;

public interface WebViewCallbacks {
  public void urlChangeEvent(String url);

  public void closeEvent(String url);

  public void pageLoaded();

  public void pageLoadError();

  public void messageReceived(JSObject obj);
}
