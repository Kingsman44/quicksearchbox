package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bj */
/* compiled from: PG */
public final class C64476bj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64476bj f174884b;

    /* renamed from: c */
    private static volatile C63010eb f174885c;

    /* renamed from: a */
    public C64520d f174886a;

    static {
        C64476bj bjVar = new C64476bj();
        f174884b = bjVar;
        C62942bv.registerDefaultInstance(C64476bj.class, bjVar);
    }

    private C64476bj() {
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
                return newMessageInfo(f174884b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C64476bj();
            case 4:
                return new C64475bi();
            case 5:
                return f174884b;
            case 6:
                C63010eb ebVar = f174885c;
                if (ebVar == null) {
                    synchronized (C64476bj.class) {
                        ebVar = f174885c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174884b);
                            f174885c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
