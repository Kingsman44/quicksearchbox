package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cp */
/* compiled from: PG */
public final class C64509cp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64509cp f174959c;

    /* renamed from: d */
    private static volatile C63010eb f174960d;

    /* renamed from: a */
    public C64455ap f174961a;

    /* renamed from: b */
    public C64505cl f174962b;

    static {
        C64509cp cpVar = new C64509cp();
        f174959c = cpVar;
        C62942bv.registerDefaultInstance(C64509cp.class, cpVar);
    }

    private C64509cp() {
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
                return newMessageInfo(f174959c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C64509cp();
            case 4:
                return new C64508co();
            case 5:
                return f174959c;
            case 6:
                C63010eb ebVar = f174960d;
                if (ebVar == null) {
                    synchronized (C64509cp.class) {
                        ebVar = f174960d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174959c);
                            f174960d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
