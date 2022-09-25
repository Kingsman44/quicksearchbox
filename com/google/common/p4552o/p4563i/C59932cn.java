package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cn */
/* compiled from: PG */
public final class C59932cn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59932cn f161978d;

    /* renamed from: e */
    private static volatile C63010eb f161979e;

    /* renamed from: a */
    public int f161980a;

    /* renamed from: b */
    public int f161981b;

    /* renamed from: c */
    public int f161982c;

    static {
        C59932cn cnVar = new C59932cn();
        f161978d = cnVar;
        C62942bv.registerDefaultInstance(C59932cn.class, cnVar);
    }

    private C59932cn() {
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
                return newMessageInfo(f161978d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C59974x.f162090a, C45240c.f118157a, C59869ae.f161800a});
            case 3:
                return new C59932cn();
            case 4:
                return new C59931cm();
            case 5:
                return f161978d;
            case 6:
                C63010eb ebVar = f161979e;
                if (ebVar == null) {
                    synchronized (C59932cn.class) {
                        ebVar = f161979e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161978d);
                            f161979e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
