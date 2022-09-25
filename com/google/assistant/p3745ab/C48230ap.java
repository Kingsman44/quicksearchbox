package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ap */
/* compiled from: PG */
public final class C48230ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48230ap f124779a;

    /* renamed from: b */
    private static volatile C63010eb f124780b;

    static {
        C48230ap apVar = new C48230ap();
        f124779a = apVar;
        C62942bv.registerDefaultInstance(C48230ap.class, apVar);
    }

    private C48230ap() {
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
                return newMessageInfo(f124779a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48230ap();
            case 4:
                return new C48229ao();
            case 5:
                return f124779a;
            case 6:
                C63010eb ebVar = f124780b;
                if (ebVar == null) {
                    synchronized (C48230ap.class) {
                        ebVar = f124780b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124779a);
                            f124780b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
