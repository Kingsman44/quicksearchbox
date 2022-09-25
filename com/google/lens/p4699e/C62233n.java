package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.n */
/* compiled from: PG */
public final class C62233n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62233n f168029a;

    /* renamed from: b */
    private static volatile C63010eb f168030b;

    static {
        C62233n nVar = new C62233n();
        f168029a = nVar;
        C62942bv.registerDefaultInstance(C62233n.class, nVar);
    }

    private C62233n() {
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
                return newMessageInfo(f168029a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62233n();
            case 4:
                return new C62232m();
            case 5:
                return f168029a;
            case 6:
                C63010eb ebVar = f168030b;
                if (ebVar == null) {
                    synchronized (C62233n.class) {
                        ebVar = f168030b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168029a);
                            f168030b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
