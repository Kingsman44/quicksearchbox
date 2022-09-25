package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.f */
/* compiled from: PG */
public final class C107480f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C107480f f299066b;

    /* renamed from: d */
    private static volatile C63010eb f299067d;

    /* renamed from: a */
    public int f299068a;

    /* renamed from: c */
    private int f299069c;

    static {
        C107480f fVar = new C107480f();
        f299066b = fVar;
        C62942bv.registerDefaultInstance(C107480f.class, fVar);
    }

    private C107480f() {
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
                return newMessageInfo(f299066b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C107480f();
            case 4:
                return new C107479e();
            case 5:
                return f299066b;
            case 6:
                C63010eb ebVar = f299067d;
                if (ebVar == null) {
                    synchronized (C107480f.class) {
                        ebVar = f299067d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299066b);
                            f299067d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
