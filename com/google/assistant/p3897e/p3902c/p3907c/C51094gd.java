package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gd */
/* compiled from: PG */
public final class C51094gd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51094gd f133005a;

    /* renamed from: b */
    private static volatile C63010eb f133006b;

    static {
        C51094gd gdVar = new C51094gd();
        f133005a = gdVar;
        C62942bv.registerDefaultInstance(C51094gd.class, gdVar);
    }

    private C51094gd() {
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
                return newMessageInfo(f133005a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51094gd();
            case 4:
                return new C51093gc();
            case 5:
                return f133005a;
            case 6:
                C63010eb ebVar = f133006b;
                if (ebVar == null) {
                    synchronized (C51094gd.class) {
                        ebVar = f133006b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133005a);
                            f133006b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
