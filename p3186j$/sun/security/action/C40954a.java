package p3186j$.sun.security.action;

import java.security.PrivilegedAction;

/* renamed from: j$.sun.security.action.a */
public final class C40954a implements PrivilegedAction {

    /* renamed from: a */
    private String f107234a = "file.encoding";

    public final Object run() {
        String property = System.getProperty(this.f107234a);
        if (property == null) {
            return null;
        }
        return property;
    }
}
