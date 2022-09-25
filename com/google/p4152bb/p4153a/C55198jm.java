package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.jm */
/* compiled from: PG */
public final class C55198jm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55198jm f145280b;

    /* renamed from: d */
    private static volatile C63010eb f145281d;

    /* renamed from: a */
    public int f145282a = 1;

    /* renamed from: c */
    private int f145283c;

    static {
        C55198jm jmVar = new C55198jm();
        f145280b = jmVar;
        C62942bv.registerDefaultInstance(C55198jm.class, jmVar);
    }

    private C55198jm() {
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
                return newMessageInfo(f145280b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C55196jk.f145279a});
            case 3:
                return new C55198jm();
            case 4:
                return new C55195jj();
            case 5:
                return f145280b;
            case 6:
                C63010eb ebVar = f145281d;
                if (ebVar == null) {
                    synchronized (C55198jm.class) {
                        ebVar = f145281d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145280b);
                            f145281d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
