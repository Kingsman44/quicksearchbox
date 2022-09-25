package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.eu */
/* compiled from: PG */
public final class C53192eu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53192eu f139414a;

    /* renamed from: b */
    private static volatile C63010eb f139415b;

    static {
        C53192eu euVar = new C53192eu();
        f139414a = euVar;
        C62942bv.registerDefaultInstance(C53192eu.class, euVar);
    }

    private C53192eu() {
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
                return newMessageInfo(f139414a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53192eu();
            case 4:
                return new C53191et();
            case 5:
                return f139414a;
            case 6:
                C63010eb ebVar = f139415b;
                if (ebVar == null) {
                    synchronized (C53192eu.class) {
                        ebVar = f139415b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139414a);
                            f139415b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
