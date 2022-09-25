package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.p */
/* compiled from: PG */
public final class C62235p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62235p f168031a;

    /* renamed from: b */
    private static volatile C63010eb f168032b;

    static {
        C62235p pVar = new C62235p();
        f168031a = pVar;
        C62942bv.registerDefaultInstance(C62235p.class, pVar);
    }

    private C62235p() {
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
                return newMessageInfo(f168031a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62235p();
            case 4:
                return new C62234o();
            case 5:
                return f168031a;
            case 6:
                C63010eb ebVar = f168032b;
                if (ebVar == null) {
                    synchronized (C62235p.class) {
                        ebVar = f168032b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168031a);
                            f168032b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
