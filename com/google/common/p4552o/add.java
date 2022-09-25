package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.add */
/* compiled from: PG */
public final class add extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final add f158348e;

    /* renamed from: f */
    private static volatile C63010eb f158349f;

    /* renamed from: a */
    public int f158350a;

    /* renamed from: b */
    public long f158351b;

    /* renamed from: c */
    public long f158352c;

    /* renamed from: d */
    public boolean f158353d;

    static {
        add add = new add();
        f158348e = add;
        C62942bv.registerDefaultInstance(add.class, add);
    }

    private add() {
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
                return newMessageInfo(f158348e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new add();
            case 4:
                return new adc();
            case 5:
                return f158348e;
            case 6:
                C63010eb ebVar = f158349f;
                if (ebVar == null) {
                    synchronized (add.class) {
                        ebVar = f158349f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158348e);
                            f158349f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
