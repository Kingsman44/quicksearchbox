package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.he */
/* compiled from: PG */
public final class C51424he extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51424he f133945a;

    /* renamed from: b */
    private static volatile C63010eb f133946b;

    static {
        C51424he heVar = new C51424he();
        f133945a = heVar;
        C62942bv.registerDefaultInstance(C51424he.class, heVar);
    }

    private C51424he() {
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
                return newMessageInfo(f133945a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51424he();
            case 4:
                return new C51423hd();
            case 5:
                return f133945a;
            case 6:
                C63010eb ebVar = f133946b;
                if (ebVar == null) {
                    synchronized (C51424he.class) {
                        ebVar = f133946b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133945a);
                            f133946b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
