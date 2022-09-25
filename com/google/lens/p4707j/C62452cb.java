package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.cb */
/* compiled from: PG */
public final class C62452cb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62452cb f168638e;

    /* renamed from: f */
    private static volatile C63010eb f168639f;

    /* renamed from: a */
    public int f168640a;

    /* renamed from: b */
    public float f168641b;

    /* renamed from: c */
    public float f168642c;

    /* renamed from: d */
    public float f168643d;

    static {
        C62452cb cbVar = new C62452cb();
        f168638e = cbVar;
        C62942bv.registerDefaultInstance(C62452cb.class, cbVar);
    }

    private C62452cb() {
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
                return newMessageInfo(f168638e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62452cb();
            case 4:
                return new C62451ca();
            case 5:
                return f168638e;
            case 6:
                C63010eb ebVar = f168639f;
                if (ebVar == null) {
                    synchronized (C62452cb.class) {
                        ebVar = f168639f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168638e);
                            f168639f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
