package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.uh */
/* compiled from: PG */
public final class C60557uh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60557uh f164272e;

    /* renamed from: f */
    private static volatile C63010eb f164273f;

    /* renamed from: a */
    public int f164274a;

    /* renamed from: b */
    public boolean f164275b;

    /* renamed from: c */
    public boolean f164276c;

    /* renamed from: d */
    public int f164277d;

    static {
        C60557uh uhVar = new C60557uh();
        f164272e = uhVar;
        C62942bv.registerDefaultInstance(C60557uh.class, uhVar);
    }

    private C60557uh() {
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
                return newMessageInfo(f164272e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60557uh();
            case 4:
                return new C60556ug();
            case 5:
                return f164272e;
            case 6:
                C63010eb ebVar = f164273f;
                if (ebVar == null) {
                    synchronized (C60557uh.class) {
                        ebVar = f164273f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164272e);
                            f164273f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
