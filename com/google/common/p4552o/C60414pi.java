package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.pi */
/* compiled from: PG */
public final class C60414pi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60414pi f163488a;

    /* renamed from: b */
    private static volatile C63010eb f163489b;

    static {
        C60414pi piVar = new C60414pi();
        f163488a = piVar;
        C62942bv.registerDefaultInstance(C60414pi.class, piVar);
    }

    private C60414pi() {
        emptyIntList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f163488a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60414pi();
            case 4:
                return new C60413ph();
            case 5:
                return f163488a;
            case 6:
                C63010eb ebVar = f163489b;
                if (ebVar == null) {
                    synchronized (C60414pi.class) {
                        ebVar = f163489b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163488a);
                            f163489b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
