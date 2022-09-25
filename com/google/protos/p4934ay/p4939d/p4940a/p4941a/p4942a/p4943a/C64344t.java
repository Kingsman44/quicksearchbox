package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.t */
/* compiled from: PG */
public final class C64344t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64344t f173940a;

    /* renamed from: b */
    private static volatile C63010eb f173941b;

    static {
        C64344t tVar = new C64344t();
        f173940a = tVar;
        C62942bv.registerDefaultInstance(C64344t.class, tVar);
    }

    private C64344t() {
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
                return newMessageInfo(f173940a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64344t();
            case 4:
                return new C64343s();
            case 5:
                return f173940a;
            case 6:
                C63010eb ebVar = f173941b;
                if (ebVar == null) {
                    synchronized (C64344t.class) {
                        ebVar = f173941b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173940a);
                            f173941b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
