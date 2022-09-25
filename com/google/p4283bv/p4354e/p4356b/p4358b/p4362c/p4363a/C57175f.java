package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.f */
/* compiled from: PG */
public final class C57175f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57175f f152638d;

    /* renamed from: f */
    private static volatile C63010eb f152639f;

    /* renamed from: a */
    public int f152640a = 0;

    /* renamed from: b */
    public Object f152641b;

    /* renamed from: c */
    public C57194y f152642c;

    /* renamed from: e */
    private int f152643e;

    static {
        C57175f fVar = new C57175f();
        f152638d = fVar;
        C62942bv.registerDefaultInstance(C57175f.class, fVar);
    }

    private C57175f() {
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
                return newMessageInfo(f152638d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C57174e.class, C57172c.class});
            case 3:
                return new C57175f();
            case 4:
                return new C57170a();
            case 5:
                return f152638d;
            case 6:
                C63010eb ebVar = f152639f;
                if (ebVar == null) {
                    synchronized (C57175f.class) {
                        ebVar = f152639f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152638d);
                            f152639f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
