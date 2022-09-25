package com.google.common.p4552o.p4554b.p4555a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.r */
/* compiled from: PG */
public final class C59638r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59638r f159899d;

    /* renamed from: e */
    private static volatile C63010eb f159900e;

    /* renamed from: a */
    public int f159901a;

    /* renamed from: b */
    public int f159902b;

    /* renamed from: c */
    public int f159903c;

    static {
        C59638r rVar = new C59638r();
        f159899d = rVar;
        C62942bv.registerDefaultInstance(C59638r.class, rVar);
    }

    private C59638r() {
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
                return newMessageInfo(f159899d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C59639s.f159904a, C45240c.f118157a, C59644x.m92472b()});
            case 3:
                return new C59638r();
            case 4:
                return new C59637q();
            case 5:
                return f159899d;
            case 6:
                C63010eb ebVar = f159900e;
                if (ebVar == null) {
                    synchronized (C59638r.class) {
                        ebVar = f159900e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159899d);
                            f159900e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
