package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.et */
/* compiled from: PG */
public final class C62524et extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62524et f168815a;

    /* renamed from: b */
    private static volatile C63010eb f168816b;

    static {
        C62524et etVar = new C62524et();
        f168815a = etVar;
        C62942bv.registerDefaultInstance(C62524et.class, etVar);
    }

    private C62524et() {
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
                return newMessageInfo(f168815a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62524et();
            case 4:
                return new C62523es();
            case 5:
                return f168815a;
            case 6:
                C63010eb ebVar = f168816b;
                if (ebVar == null) {
                    synchronized (C62524et.class) {
                        ebVar = f168816b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168815a);
                            f168816b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
