package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.l */
/* compiled from: PG */
public final class C134506l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134506l f366297c;

    /* renamed from: d */
    private static volatile C63010eb f366298d;

    /* renamed from: a */
    public int f366299a = 0;

    /* renamed from: b */
    public Object f366300b;

    static {
        C134506l lVar = new C134506l();
        f366297c = lVar;
        C62942bv.registerDefaultInstance(C134506l.class, lVar);
    }

    private C134506l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f366297c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C134512r.class, C134514t.class, C134495ab.class});
            case 3:
                return new C134506l();
            case 4:
                return new C134505k();
            case 5:
                return f366297c;
            case 6:
                C63010eb ebVar = f366298d;
                if (ebVar == null) {
                    synchronized (C134506l.class) {
                        ebVar = f366298d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366297c);
                            f366298d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
