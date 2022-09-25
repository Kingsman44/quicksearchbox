package com.google.android.apps.auto.p450a.p451a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.auto.a.a.af */
/* compiled from: PG */
public final class C8861af extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8861af f30777e;

    /* renamed from: f */
    private static volatile C63010eb f30778f;

    /* renamed from: a */
    public int f30779a;

    /* renamed from: b */
    public C63042fg f30780b;

    /* renamed from: c */
    public C8877av f30781c;

    /* renamed from: d */
    public C8871ap f30782d;

    static {
        C8861af afVar = new C8861af();
        f30777e = afVar;
        C62942bv.registerDefaultInstance(C8861af.class, afVar);
    }

    private C8861af() {
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
                return newMessageInfo(f30777e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8861af();
            case 4:
                return new C8860ae();
            case 5:
                return f30777e;
            case 6:
                C63010eb ebVar = f30778f;
                if (ebVar == null) {
                    synchronized (C8861af.class) {
                        ebVar = f30778f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30777e);
                            f30778f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
