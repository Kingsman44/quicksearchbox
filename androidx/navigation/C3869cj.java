package androidx.navigation;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.cj */
/* compiled from: PG */
public final class C3869cj {
    /* renamed from: a */
    public static final boolean m11161a(String str) {
        return str != null && str.length() > 0;
    }

    /* renamed from: b */
    public static final String m11162b(Class cls) {
        C69664n.m101061g(cls, "navigatorClass");
        String str = (String) C3870ck.f12430a.get(cls);
        if (str == null) {
            C3865cf cfVar = (C3865cf) cls.getAnnotation(C3865cf.class);
            if (cfVar == null) {
                str = null;
            } else {
                str = cfVar.mo8118a();
            }
            if (m11161a(str)) {
                C3870ck.f12430a.put(cls, str);
            } else {
                throw new IllegalArgumentException(C69664n.m101057c("No @Navigator.Name annotation found for ", cls.getSimpleName()));
            }
        }
        C69664n.m101058d(str);
        return str;
    }
}
