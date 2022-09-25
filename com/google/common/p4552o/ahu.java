package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahu */
/* compiled from: PG */
public final class ahu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahu f158783a;

    /* renamed from: b */
    private static volatile C63010eb f158784b;

    static {
        ahu ahu = new ahu();
        f158783a = ahu;
        C62942bv.registerDefaultInstance(ahu.class, ahu);
    }

    private ahu() {
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
                return newMessageInfo(f158783a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahu();
            case 4:
                return new aht();
            case 5:
                return f158783a;
            case 6:
                C63010eb ebVar = f158784b;
                if (ebVar == null) {
                    synchronized (ahu.class) {
                        ebVar = f158784b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158783a);
                            f158784b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
