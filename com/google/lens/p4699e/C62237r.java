package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.r */
/* compiled from: PG */
public final class C62237r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62237r f168033a;

    /* renamed from: b */
    private static volatile C63010eb f168034b;

    static {
        C62237r rVar = new C62237r();
        f168033a = rVar;
        C62942bv.registerDefaultInstance(C62237r.class, rVar);
    }

    private C62237r() {
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
                return newMessageInfo(f168033a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62237r();
            case 4:
                return new C62236q();
            case 5:
                return f168033a;
            case 6:
                C63010eb ebVar = f168034b;
                if (ebVar == null) {
                    synchronized (C62237r.class) {
                        ebVar = f168034b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168033a);
                            f168034b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
