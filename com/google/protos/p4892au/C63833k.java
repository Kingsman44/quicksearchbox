package com.google.protos.p4892au;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.au.k */
/* compiled from: PG */
public final class C63833k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63833k f172626a;

    /* renamed from: b */
    private static volatile C63010eb f172627b;

    static {
        C63833k kVar = new C63833k();
        f172626a = kVar;
        C62942bv.registerDefaultInstance(C63833k.class, kVar);
    }

    private C63833k() {
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
                return newMessageInfo(f172626a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C63833k();
            case 4:
                return new C63832j();
            case 5:
                return f172626a;
            case 6:
                C63010eb ebVar = f172627b;
                if (ebVar == null) {
                    synchronized (C63833k.class) {
                        ebVar = f172627b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172626a);
                            f172627b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
