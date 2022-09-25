package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ck */
/* compiled from: PG */
public final class C62461ck extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62461ck f168659a;

    /* renamed from: b */
    private static volatile C63010eb f168660b;

    static {
        C62461ck ckVar = new C62461ck();
        f168659a = ckVar;
        C62942bv.registerDefaultInstance(C62461ck.class, ckVar);
    }

    private C62461ck() {
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
                return newMessageInfo(f168659a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62461ck();
            case 4:
                return new C62460cj();
            case 5:
                return f168659a;
            case 6:
                C63010eb ebVar = f168660b;
                if (ebVar == null) {
                    synchronized (C62461ck.class) {
                        ebVar = f168660b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168659a);
                            f168660b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
