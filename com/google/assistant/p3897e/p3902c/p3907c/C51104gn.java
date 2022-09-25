package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gn */
/* compiled from: PG */
public final class C51104gn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51104gn f133023a;

    /* renamed from: b */
    private static volatile C63010eb f133024b;

    static {
        C51104gn gnVar = new C51104gn();
        f133023a = gnVar;
        C62942bv.registerDefaultInstance(C51104gn.class, gnVar);
    }

    private C51104gn() {
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
                return newMessageInfo(f133023a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51104gn();
            case 4:
                return new C51103gm();
            case 5:
                return f133023a;
            case 6:
                C63010eb ebVar = f133024b;
                if (ebVar == null) {
                    synchronized (C51104gn.class) {
                        ebVar = f133024b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133023a);
                            f133024b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
