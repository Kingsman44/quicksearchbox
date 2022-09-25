package com.google.p363ad.p364a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.y */
/* compiled from: PG */
public final class C6701y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C6701y f20005a;

    /* renamed from: b */
    private static volatile C63010eb f20006b;

    static {
        C6701y yVar = new C6701y();
        f20005a = yVar;
        C62942bv.registerDefaultInstance(C6701y.class, yVar);
    }

    private C6701y() {
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
                return newMessageInfo(f20005a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C6701y();
            case 4:
                return new C6700x();
            case 5:
                return f20005a;
            case 6:
                C63010eb ebVar = f20006b;
                if (ebVar == null) {
                    synchronized (C6701y.class) {
                        ebVar = f20006b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f20005a);
                            f20006b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
