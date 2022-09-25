package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.p.b.d */
/* compiled from: PG */
public final class C65823d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65823d f178941c;

    /* renamed from: d */
    private static volatile C63010eb f178942d;

    /* renamed from: a */
    public int f178943a;

    /* renamed from: b */
    public C63088z f178944b = C63088z.f170246b;

    static {
        C65823d dVar = new C65823d();
        f178941c = dVar;
        C62942bv.registerDefaultInstance(C65823d.class, dVar);
    }

    private C65823d() {
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
                return newMessageInfo(f178941c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65823d();
            case 4:
                return new C65796c();
            case 5:
                return f178941c;
            case 6:
                C63010eb ebVar = f178942d;
                if (ebVar == null) {
                    synchronized (C65823d.class) {
                        ebVar = f178942d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178941c);
                            f178942d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
