package com.google.android.apps.search.googleapp.p10310h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.h.r */
/* compiled from: PG */
public final class C136137r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136137r f370767d;

    /* renamed from: e */
    private static volatile C63010eb f370768e;

    /* renamed from: a */
    public int f370769a;

    /* renamed from: b */
    public int f370770b;

    /* renamed from: c */
    public boolean f370771c;

    static {
        C136137r rVar = new C136137r();
        f370767d = rVar;
        C62942bv.registerDefaultInstance(C136137r.class, rVar);
    }

    private C136137r() {
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
                return newMessageInfo(f370767d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136137r();
            case 4:
                return new C136136q();
            case 5:
                return f370767d;
            case 6:
                C63010eb ebVar = f370768e;
                if (ebVar == null) {
                    synchronized (C136137r.class) {
                        ebVar = f370768e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370767d);
                            f370768e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
