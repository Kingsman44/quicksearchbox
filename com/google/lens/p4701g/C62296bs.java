package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bs */
/* compiled from: PG */
public final class C62296bs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62296bs f168175a;

    /* renamed from: b */
    private static volatile C63010eb f168176b;

    static {
        C62296bs bsVar = new C62296bs();
        f168175a = bsVar;
        C62942bv.registerDefaultInstance(C62296bs.class, bsVar);
    }

    private C62296bs() {
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
                return newMessageInfo(f168175a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62296bs();
            case 4:
                return new C62295br();
            case 5:
                return f168175a;
            case 6:
                C63010eb ebVar = f168176b;
                if (ebVar == null) {
                    synchronized (C62296bs.class) {
                        ebVar = f168176b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168175a);
                            f168176b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
