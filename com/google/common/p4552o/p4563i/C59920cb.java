package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cb */
/* compiled from: PG */
public final class C59920cb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59920cb f161950d;

    /* renamed from: e */
    private static volatile C63010eb f161951e;

    /* renamed from: a */
    public int f161952a;

    /* renamed from: b */
    public C59917bz f161953b;

    /* renamed from: c */
    public int f161954c;

    static {
        C59920cb cbVar = new C59920cb();
        f161950d = cbVar;
        C62942bv.registerDefaultInstance(C59920cb.class, cbVar);
    }

    private C59920cb() {
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
                return newMessageInfo(f161950d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59920cb();
            case 4:
                return new C59919ca();
            case 5:
                return f161950d;
            case 6:
                C63010eb ebVar = f161951e;
                if (ebVar == null) {
                    synchronized (C59920cb.class) {
                        ebVar = f161951e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161950d);
                            f161951e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
