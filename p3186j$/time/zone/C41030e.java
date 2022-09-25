package p3186j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j$.time.zone.e */
final class C41030e implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ List f107485a;

    C41030e(ArrayList arrayList) {
        this.f107485a = arrayList;
    }

    public final Object run() {
        Class<C41032g> cls = C41032g.class;
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                C41032g cast = cls.cast(Class.forName(property, true, cls.getClassLoader()).newInstance());
                C41032g.m71616e(cast);
                this.f107485a.add(cast);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        } else {
            C41032g.m71616e(new C41031f());
            return null;
        }
    }
}
