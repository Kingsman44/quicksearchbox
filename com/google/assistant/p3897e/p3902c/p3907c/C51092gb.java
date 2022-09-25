package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gb */
/* compiled from: PG */
public final class C51092gb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51092gb f133003a;

    /* renamed from: b */
    private static volatile C63010eb f133004b;

    static {
        C51092gb gbVar = new C51092gb();
        f133003a = gbVar;
        C62942bv.registerDefaultInstance(C51092gb.class, gbVar);
    }

    private C51092gb() {
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
                return newMessageInfo(f133003a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51092gb();
            case 4:
                return new C51091ga();
            case 5:
                return f133003a;
            case 6:
                C63010eb ebVar = f133004b;
                if (ebVar == null) {
                    synchronized (C51092gb.class) {
                        ebVar = f133004b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133003a);
                            f133004b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
