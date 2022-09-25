package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.iy */
/* compiled from: PG */
public final class C55183iy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55183iy f145261b;

    /* renamed from: d */
    private static volatile C63010eb f145262d;

    /* renamed from: a */
    public int f145263a;

    /* renamed from: c */
    private int f145264c;

    static {
        C55183iy iyVar = new C55183iy();
        f145261b = iyVar;
        C62942bv.registerDefaultInstance(C55183iy.class, iyVar);
    }

    private C55183iy() {
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
                return newMessageInfo(f145261b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C55181iw.f145260a});
            case 3:
                return new C55183iy();
            case 4:
                return new C55180iv();
            case 5:
                return f145261b;
            case 6:
                C63010eb ebVar = f145262d;
                if (ebVar == null) {
                    synchronized (C55183iy.class) {
                        ebVar = f145262d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145261b);
                            f145262d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
