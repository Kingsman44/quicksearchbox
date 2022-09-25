package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ka */
/* compiled from: PG */
public final class C53334ka extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53334ka f139957a;

    /* renamed from: b */
    private static volatile C63010eb f139958b;

    static {
        C53334ka kaVar = new C53334ka();
        f139957a = kaVar;
        C62942bv.registerDefaultInstance(C53334ka.class, kaVar);
    }

    private C53334ka() {
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
                return newMessageInfo(f139957a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53334ka();
            case 4:
                return new C53332jz();
            case 5:
                return f139957a;
            case 6:
                C63010eb ebVar = f139958b;
                if (ebVar == null) {
                    synchronized (C53334ka.class) {
                        ebVar = f139958b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139957a);
                            f139958b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
