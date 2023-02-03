import org.wso2.carbon.identity.application.authentication.framework.config.model.graph.js.JsServletResponse;
@FunctionalInterface
public interface SetTextCookieFunction {

    void setTextCookie(JsServletResponse response, String name, String value, Object... params);

}
