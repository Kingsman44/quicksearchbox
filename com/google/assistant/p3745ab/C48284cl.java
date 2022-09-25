package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cl */
/* compiled from: PG */
public final class C48284cl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48284cl f124879a;

    /* renamed from: b */
    private static volatile C63010eb f124880b;

    static {
        C48284cl clVar = new C48284cl();
        f124879a = clVar;
        C62942bv.registerDefaultInstance(C48284cl.class, clVar);
    }

    private C48284cl() {
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
                return newMessageInfo(f124879a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48284cl();
            case 4:
                return new C48283ck();
            case 5:
                return f124879a;
            case 6:
                C63010eb ebVar = f124880b;
                if (ebVar == null) {
                    synchronized (C48284cl.class) {
                        ebVar = f124880b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124879a);
                            f124880b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
