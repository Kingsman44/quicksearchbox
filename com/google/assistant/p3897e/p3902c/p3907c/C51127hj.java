package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hj */
/* compiled from: PG */
public final class C51127hj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51127hj f133085a;

    /* renamed from: b */
    private static volatile C63010eb f133086b;

    static {
        C51127hj hjVar = new C51127hj();
        f133085a = hjVar;
        C62942bv.registerDefaultInstance(C51127hj.class, hjVar);
    }

    private C51127hj() {
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
                return newMessageInfo(f133085a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51127hj();
            case 4:
                return new C51126hi();
            case 5:
                return f133085a;
            case 6:
                C63010eb ebVar = f133086b;
                if (ebVar == null) {
                    synchronized (C51127hj.class) {
                        ebVar = f133086b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133085a);
                            f133086b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
