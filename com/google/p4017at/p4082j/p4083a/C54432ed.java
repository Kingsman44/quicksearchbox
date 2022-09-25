package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.j.a.ed */
/* compiled from: PG */
public final class C54432ed extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54432ed f142944d;

    /* renamed from: e */
    private static volatile C63010eb f142945e;

    /* renamed from: a */
    public C54455t f142946a;

    /* renamed from: b */
    public int f142947b;

    /* renamed from: c */
    public C63042fg f142948c;

    static {
        C54432ed edVar = new C54432ed();
        f142944d = edVar;
        C62942bv.registerDefaultInstance(C54432ed.class, edVar);
    }

    private C54432ed() {
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
                return newMessageInfo(f142944d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54432ed();
            case 4:
                return new C54431ec();
            case 5:
                return f142944d;
            case 6:
                C63010eb ebVar = f142945e;
                if (ebVar == null) {
                    synchronized (C54432ed.class) {
                        ebVar = f142945e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142944d);
                            f142945e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
