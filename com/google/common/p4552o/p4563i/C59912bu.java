package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.bu */
/* compiled from: PG */
public final class C59912bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59912bu f161925d;

    /* renamed from: e */
    private static volatile C63010eb f161926e;

    /* renamed from: a */
    public int f161927a;

    /* renamed from: b */
    public C59911bt f161928b;

    /* renamed from: c */
    public C59909br f161929c;

    static {
        C59912bu buVar = new C59912bu();
        f161925d = buVar;
        C62942bv.registerDefaultInstance(C59912bu.class, buVar);
    }

    private C59912bu() {
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
                return newMessageInfo(f161925d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59912bu();
            case 4:
                return new C59907bp();
            case 5:
                return f161925d;
            case 6:
                C63010eb ebVar = f161926e;
                if (ebVar == null) {
                    synchronized (C59912bu.class) {
                        ebVar = f161926e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161925d);
                            f161926e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
