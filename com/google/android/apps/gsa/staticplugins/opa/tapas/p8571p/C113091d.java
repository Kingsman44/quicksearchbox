package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.d */
/* compiled from: PG */
public final class C113091d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C113091d f313351e;

    /* renamed from: f */
    private static volatile C63010eb f313352f;

    /* renamed from: a */
    public int f313353a;

    /* renamed from: b */
    public int f313354b;

    /* renamed from: c */
    public int f313355c;

    /* renamed from: d */
    public C113091d f313356d;

    static {
        C113091d dVar = new C113091d();
        f313351e = dVar;
        C62942bv.registerDefaultInstance(C113091d.class, dVar);
    }

    private C113091d() {
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
                return newMessageInfo(f313351e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C113091d();
            case 4:
                return new C113079c();
            case 5:
                return f313351e;
            case 6:
                C63010eb ebVar = f313352f;
                if (ebVar == null) {
                    synchronized (C113091d.class) {
                        ebVar = f313352f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313351e);
                            f313352f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
