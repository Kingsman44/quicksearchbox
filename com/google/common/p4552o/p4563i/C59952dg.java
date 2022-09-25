package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.dg */
/* compiled from: PG */
public final class C59952dg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59952dg f162032e;

    /* renamed from: f */
    private static volatile C63010eb f162033f;

    /* renamed from: a */
    public int f162034a;

    /* renamed from: b */
    public C59947db f162035b;

    /* renamed from: c */
    public C62971cq f162036c = emptyProtobufList();

    /* renamed from: d */
    public boolean f162037d;

    static {
        C59952dg dgVar = new C59952dg();
        f162032e = dgVar;
        C62942bv.registerDefaultInstance(C59952dg.class, dgVar);
    }

    private C59952dg() {
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
                return newMessageInfo(f162032e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C59951df.class, "d"});
            case 3:
                return new C59952dg();
            case 4:
                return new C59944cz();
            case 5:
                return f162032e;
            case 6:
                C63010eb ebVar = f162033f;
                if (ebVar == null) {
                    synchronized (C59952dg.class) {
                        ebVar = f162033f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162032e);
                            f162033f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
