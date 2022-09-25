package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ci */
/* compiled from: PG */
public final class C64502ci extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64502ci f174945b;

    /* renamed from: c */
    private static volatile C63010eb f174946c;

    /* renamed from: a */
    public C64501ch f174947a;

    static {
        C64502ci ciVar = new C64502ci();
        f174945b = ciVar;
        C62942bv.registerDefaultInstance(C64502ci.class, ciVar);
    }

    private C64502ci() {
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
                return newMessageInfo(f174945b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C64502ci();
            case 4:
                return new C64492bz();
            case 5:
                return f174945b;
            case 6:
                C63010eb ebVar = f174946c;
                if (ebVar == null) {
                    synchronized (C64502ci.class) {
                        ebVar = f174946c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174945b);
                            f174946c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
