package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.an */
/* compiled from: PG */
public final class C64295an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64295an f173840a;

    /* renamed from: b */
    private static volatile C63010eb f173841b;

    static {
        C64295an anVar = new C64295an();
        f173840a = anVar;
        C62942bv.registerDefaultInstance(C64295an.class, anVar);
    }

    private C64295an() {
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
                return newMessageInfo(f173840a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64295an();
            case 4:
                return new C64294am();
            case 5:
                return f173840a;
            case 6:
                C63010eb ebVar = f173841b;
                if (ebVar == null) {
                    synchronized (C64295an.class) {
                        ebVar = f173841b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173840a);
                            f173841b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
