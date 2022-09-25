package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.cb */
/* compiled from: PG */
public final class C60164cb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60164cb f162753e;

    /* renamed from: f */
    private static volatile C63010eb f162754f;

    /* renamed from: a */
    public int f162755a;

    /* renamed from: b */
    public int f162756b;

    /* renamed from: c */
    public int f162757c;

    /* renamed from: d */
    public int f162758d;

    static {
        C60164cb cbVar = new C60164cb();
        f162753e = cbVar;
        C62942bv.registerDefaultInstance(C60164cb.class, cbVar);
    }

    private C60164cb() {
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
                return newMessageInfo(f162753e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60164cb();
            case 4:
                return new C60163ca();
            case 5:
                return f162753e;
            case 6:
                C63010eb ebVar = f162754f;
                if (ebVar == null) {
                    synchronized (C60164cb.class) {
                        ebVar = f162754f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162753e);
                            f162754f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
