package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.av */
/* compiled from: PG */
public final class C62272av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62272av f168124a;

    /* renamed from: b */
    private static volatile C63010eb f168125b;

    static {
        C62272av avVar = new C62272av();
        f168124a = avVar;
        C62942bv.registerDefaultInstance(C62272av.class, avVar);
    }

    private C62272av() {
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
                return newMessageInfo(f168124a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62272av();
            case 4:
                return new C62271au();
            case 5:
                return f168124a;
            case 6:
                C63010eb ebVar = f168125b;
                if (ebVar == null) {
                    synchronized (C62272av.class) {
                        ebVar = f168125b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168124a);
                            f168125b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
