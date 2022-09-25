package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.x */
/* compiled from: PG */
public final class C113586x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C113586x f314502c;

    /* renamed from: d */
    private static volatile C63010eb f314503d;

    /* renamed from: a */
    public int f314504a;

    /* renamed from: b */
    public int f314505b;

    static {
        C113586x xVar = new C113586x();
        f314502c = xVar;
        C62942bv.registerDefaultInstance(C113586x.class, xVar);
    }

    private C113586x() {
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
                return newMessageInfo(f314502c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C113586x();
            case 4:
                return new C113585w();
            case 5:
                return f314502c;
            case 6:
                C63010eb ebVar = f314503d;
                if (ebVar == null) {
                    synchronized (C113586x.class) {
                        ebVar = f314503d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f314502c);
                            f314503d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
