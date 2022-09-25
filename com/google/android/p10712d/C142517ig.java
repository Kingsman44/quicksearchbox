package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.ig */
/* compiled from: PG */
public final class C142517ig extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142517ig f386734d;

    /* renamed from: e */
    private static volatile C63010eb f386735e;

    /* renamed from: a */
    public int f386736a;

    /* renamed from: b */
    public int f386737b = 1;

    /* renamed from: c */
    public C63088z f386738c = C63088z.f170246b;

    static {
        C142517ig igVar = new C142517ig();
        f386734d = igVar;
        C62942bv.registerDefaultInstance(C142517ig.class, igVar);
    }

    private C142517ig() {
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
                return newMessageInfo(f386734d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", C142516if.f386733a, C45240c.f118157a});
            case 3:
                return new C142517ig();
            case 4:
                return new C142515ie();
            case 5:
                return f386734d;
            case 6:
                C63010eb ebVar = f386735e;
                if (ebVar == null) {
                    synchronized (C142517ig.class) {
                        ebVar = f386735e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386734d);
                            f386735e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
