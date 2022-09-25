package com.google.assistant.p4016z;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8216c.C106525b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f.C106555d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8220g.C106558b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8221h.C106561b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j.C106570d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106575b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106586c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106588b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8227n.C106590b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.bm */
/* compiled from: PG */
public final class C53715bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53715bm f141021c;

    /* renamed from: e */
    private static volatile C63010eb f141022e;

    /* renamed from: a */
    public int f141023a = 0;

    /* renamed from: b */
    public Object f141024b;

    /* renamed from: d */
    private byte f141025d = 2;

    static {
        C53715bm bmVar = new C53715bm();
        f141021c = bmVar;
        C62942bv.registerDefaultInstance(C53715bm.class, bmVar);
    }

    private C53715bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141025d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141025d = b;
                return null;
            case 2:
                return newMessageInfo(f141021c, "\u0001\u000b\u0001\u0000\u0001\u000f\u000b\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0007ြ\u0000\tြ\u0000\nြ\u0000\fᐼ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000", new Object[]{"b", "a", C106555d.class, C106586c.class, C106561b.class, C106532f.class, C106575b.class, C106525b.class, C106558b.class, C106588b.class, C106570d.class, C53723h.class, C106590b.class});
            case 3:
                return new C53715bm();
            case 4:
                return new C53713bk();
            case 5:
                return f141021c;
            case 6:
                C63010eb ebVar = f141022e;
                if (ebVar == null) {
                    synchronized (C53715bm.class) {
                        ebVar = f141022e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141021c);
                            f141022e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
