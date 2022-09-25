package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahu */
/* compiled from: PG */
public final class ahu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahu f135119a;

    /* renamed from: b */
    private static volatile C63010eb f135120b;

    static {
        ahu ahu = new ahu();
        f135119a = ahu;
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
                return newMessageInfo(f135119a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahu();
            case 4:
                return new aht();
            case 5:
                return f135119a;
            case 6:
                C63010eb ebVar = f135120b;
                if (ebVar == null) {
                    synchronized (ahu.class) {
                        ebVar = f135120b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135119a);
                            f135120b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
