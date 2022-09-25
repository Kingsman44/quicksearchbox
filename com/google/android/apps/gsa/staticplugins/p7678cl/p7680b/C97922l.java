package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.l */
/* compiled from: PG */
public final class C97922l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97922l f273432e;

    /* renamed from: f */
    private static volatile C63010eb f273433f;

    /* renamed from: a */
    public int f273434a;

    /* renamed from: b */
    public int f273435b;

    /* renamed from: c */
    public int f273436c;

    /* renamed from: d */
    public int f273437d;

    static {
        C97922l lVar = new C97922l();
        f273432e = lVar;
        C62942bv.registerDefaultInstance(C97922l.class, lVar);
    }

    private C97922l() {
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
                return newMessageInfo(f273432e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C97922l();
            case 4:
                return new C97921k();
            case 5:
                return f273432e;
            case 6:
                C63010eb ebVar = f273433f;
                if (ebVar == null) {
                    synchronized (C97922l.class) {
                        ebVar = f273433f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273432e);
                            f273433f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
