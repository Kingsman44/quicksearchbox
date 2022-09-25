package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.f */
/* compiled from: PG */
public final class C62225f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62225f f168012a;

    /* renamed from: b */
    private static volatile C63010eb f168013b;

    static {
        C62225f fVar = new C62225f();
        f168012a = fVar;
        C62942bv.registerDefaultInstance(C62225f.class, fVar);
    }

    private C62225f() {
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
                return newMessageInfo(f168012a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62225f();
            case 4:
                return new C62224e();
            case 5:
                return f168012a;
            case 6:
                C63010eb ebVar = f168013b;
                if (ebVar == null) {
                    synchronized (C62225f.class) {
                        ebVar = f168013b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168012a);
                            f168013b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
