package mz.baloi.learing.jxrs;

import javax.ws.rs.ApplicationPath;

import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("resources")
public class RestApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }
}
