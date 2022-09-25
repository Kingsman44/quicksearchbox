package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aqb */
/* compiled from: PG */
public final class aqb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aqb f159713f;

    /* renamed from: g */
    private static volatile C63010eb f159714g;

    /* renamed from: a */
    public int f159715a;

    /* renamed from: b */
    public long f159716b;

    /* renamed from: c */
    public int f159717c;

    /* renamed from: d */
    public int f159718d;

    /* renamed from: e */
    public int f159719e;

    static {
        aqb aqb = new aqb();
        f159713f = aqb;
        C62942bv.registerDefaultInstance(aqb.class, aqb);
    }

    private aqb() {
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
                return newMessageInfo(f159713f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", apz.f159712a, "e"});
            case 3:
                return new aqb();
            case 4:
                return new apy();
            case 5:
                return f159713f;
            case 6:
                C63010eb ebVar = f159714g;
                if (ebVar == null) {
                    synchronized (aqb.class) {
                        ebVar = f159714g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159713f);
                            f159714g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
