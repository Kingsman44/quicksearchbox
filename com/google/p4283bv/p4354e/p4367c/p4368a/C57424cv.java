package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.cv */
/* compiled from: PG */
public final class C57424cv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57424cv f153396b;

    /* renamed from: d */
    private static volatile C63010eb f153397d;

    /* renamed from: a */
    public int f153398a;

    /* renamed from: c */
    private int f153399c;

    static {
        C57424cv cvVar = new C57424cv();
        f153396b = cvVar;
        C62942bv.registerDefaultInstance(C57424cv.class, cvVar);
    }

    private C57424cv() {
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
                return newMessageInfo(f153396b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C57422ct.f153395a});
            case 3:
                return new C57424cv();
            case 4:
                return new C57421cs();
            case 5:
                return f153396b;
            case 6:
                C63010eb ebVar = f153397d;
                if (ebVar == null) {
                    synchronized (C57424cv.class) {
                        ebVar = f153397d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153396b);
                            f153397d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
