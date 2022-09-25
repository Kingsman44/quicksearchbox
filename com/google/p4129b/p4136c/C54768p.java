package com.google.p4129b.p4136c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.p */
/* compiled from: PG */
public final class C54768p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54768p f143692a;

    /* renamed from: b */
    private static volatile C63010eb f143693b;

    static {
        C54768p pVar = new C54768p();
        f143692a = pVar;
        C62942bv.registerDefaultInstance(C54768p.class, pVar);
    }

    private C54768p() {
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
                return newMessageInfo(f143692a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54768p();
            case 4:
                return new C54767o();
            case 5:
                return f143692a;
            case 6:
                C63010eb ebVar = f143693b;
                if (ebVar == null) {
                    synchronized (C54768p.class) {
                        ebVar = f143693b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143692a);
                            f143693b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
