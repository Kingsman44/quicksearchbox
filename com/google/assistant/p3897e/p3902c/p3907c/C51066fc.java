package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fc */
/* compiled from: PG */
public final class C51066fc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51066fc f132970a;

    /* renamed from: b */
    private static volatile C63010eb f132971b;

    static {
        C51066fc fcVar = new C51066fc();
        f132970a = fcVar;
        C62942bv.registerDefaultInstance(C51066fc.class, fcVar);
    }

    private C51066fc() {
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
                return newMessageInfo(f132970a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51066fc();
            case 4:
                return new C51065fb();
            case 5:
                return f132970a;
            case 6:
                C63010eb ebVar = f132971b;
                if (ebVar == null) {
                    synchronized (C51066fc.class) {
                        ebVar = f132971b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132970a);
                            f132971b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
