package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.r */
/* compiled from: PG */
public final class C55401r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55401r f145976e;

    /* renamed from: f */
    private static volatile C63010eb f145977f;

    /* renamed from: a */
    public int f145978a;

    /* renamed from: b */
    public int f145979b;

    /* renamed from: c */
    public int f145980c;

    /* renamed from: d */
    public int f145981d;

    static {
        C55401r rVar = new C55401r();
        f145976e = rVar;
        C62942bv.registerDefaultInstance(C55401r.class, rVar);
    }

    private C55401r() {
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
                return newMessageInfo(f145976e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55401r();
            case 4:
                return new C55374q();
            case 5:
                return f145976e;
            case 6:
                C63010eb ebVar = f145977f;
                if (ebVar == null) {
                    synchronized (C55401r.class) {
                        ebVar = f145977f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145976e);
                            f145977f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
