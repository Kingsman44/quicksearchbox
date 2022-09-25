package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cj */
/* compiled from: PG */
public final class C64503cj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64503cj f174948b;

    /* renamed from: c */
    private static volatile C63010eb f174949c;

    /* renamed from: a */
    public C64502ci f174950a;

    static {
        C64503cj cjVar = new C64503cj();
        f174948b = cjVar;
        C62942bv.registerDefaultInstance(C64503cj.class, cjVar);
    }

    private C64503cj() {
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
                return newMessageInfo(f174948b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C64503cj();
            case 4:
                return new C64491by();
            case 5:
                return f174948b;
            case 6:
                C63010eb ebVar = f174949c;
                if (ebVar == null) {
                    synchronized (C64503cj.class) {
                        ebVar = f174949c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174948b);
                            f174949c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
