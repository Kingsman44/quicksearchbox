package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bo */
/* compiled from: PG */
public final class C60150bo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60150bo f162714e;

    /* renamed from: f */
    private static volatile C63010eb f162715f;

    /* renamed from: a */
    public int f162716a;

    /* renamed from: b */
    public C60126ar f162717b;

    /* renamed from: c */
    public long f162718c;

    /* renamed from: d */
    public long f162719d;

    static {
        C60150bo boVar = new C60150bo();
        f162714e = boVar;
        C62942bv.registerDefaultInstance(C60150bo.class, boVar);
    }

    private C60150bo() {
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
                return newMessageInfo(f162714e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60150bo();
            case 4:
                return new C60149bn();
            case 5:
                return f162714e;
            case 6:
                C63010eb ebVar = f162715f;
                if (ebVar == null) {
                    synchronized (C60150bo.class) {
                        ebVar = f162715f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162714e);
                            f162715f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
