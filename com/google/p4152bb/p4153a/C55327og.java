package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.og */
/* compiled from: PG */
public final class C55327og extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55327og f145758d;

    /* renamed from: f */
    private static volatile C63010eb f145759f;

    /* renamed from: a */
    public int f145760a;

    /* renamed from: b */
    public int f145761b;

    /* renamed from: c */
    public int f145762c;

    /* renamed from: e */
    private int f145763e;

    static {
        C55327og ogVar = new C55327og();
        f145758d = ogVar;
        C62942bv.registerDefaultInstance(C55327og.class, ogVar);
    }

    private C55327og() {
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
                return newMessageInfo(f145758d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C55327og();
            case 4:
                return new C55326of();
            case 5:
                return f145758d;
            case 6:
                C63010eb ebVar = f145759f;
                if (ebVar == null) {
                    synchronized (C55327og.class) {
                        ebVar = f145759f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145758d);
                            f145759f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
