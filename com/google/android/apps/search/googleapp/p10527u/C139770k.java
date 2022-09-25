package com.google.android.apps.search.googleapp.p10527u;

import com.google.android.apps.search.googleapp.collections.C133514l;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.homescreen.C136149c;
import com.google.android.apps.search.googleapp.search.C137411e;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139712d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.u.k */
/* compiled from: PG */
public final class C139770k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C139770k f379882c;

    /* renamed from: e */
    private static volatile C63010eb f379883e;

    /* renamed from: a */
    public int f379884a = 0;

    /* renamed from: b */
    public Object f379885b;

    /* renamed from: d */
    private byte f379886d = 2;

    static {
        C139770k kVar = new C139770k();
        f379882c = kVar;
        C62942bv.registerDefaultInstance(C139770k.class, kVar);
    }

    private C139770k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f379886d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f379886d = b;
                return null;
            case 2:
                return newMessageInfo(f379882c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C136149c.class, C137411e.class, C133514l.class, C135462h.class, C139712d.class});
            case 3:
                return new C139770k();
            case 4:
                return new C139769j();
            case 5:
                return f379882c;
            case 6:
                C63010eb ebVar = f379883e;
                if (ebVar == null) {
                    synchronized (C139770k.class) {
                        ebVar = f379883e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379882c);
                            f379883e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
