package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ap */
/* compiled from: PG */
public final class C53079ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53079ap f139094a;

    /* renamed from: b */
    private static volatile C63010eb f139095b;

    static {
        C53079ap apVar = new C53079ap();
        f139094a = apVar;
        C62942bv.registerDefaultInstance(C53079ap.class, apVar);
    }

    private C53079ap() {
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
                return newMessageInfo(f139094a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53079ap();
            case 4:
                return new C53078ao();
            case 5:
                return f139094a;
            case 6:
                C63010eb ebVar = f139095b;
                if (ebVar == null) {
                    synchronized (C53079ap.class) {
                        ebVar = f139095b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139094a);
                            f139095b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
