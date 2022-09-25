package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fe */
/* compiled from: PG */
public final class C51068fe extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51068fe f132972a;

    /* renamed from: b */
    private static volatile C63010eb f132973b;

    static {
        C51068fe feVar = new C51068fe();
        f132972a = feVar;
        C62942bv.registerDefaultInstance(C51068fe.class, feVar);
    }

    private C51068fe() {
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
                return newMessageInfo(f132972a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51068fe();
            case 4:
                return new C51067fd();
            case 5:
                return f132972a;
            case 6:
                C63010eb ebVar = f132973b;
                if (ebVar == null) {
                    synchronized (C51068fe.class) {
                        ebVar = f132973b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132972a);
                            f132973b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
