package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.bu */
/* compiled from: PG */
public final class C48264bu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48264bu f124843a;

    /* renamed from: b */
    private static volatile C63010eb f124844b;

    static {
        C48264bu buVar = new C48264bu();
        f124843a = buVar;
        C62942bv.registerDefaultInstance(C48264bu.class, buVar);
    }

    private C48264bu() {
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
                return newMessageInfo(f124843a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48264bu();
            case 4:
                return new C48263bt();
            case 5:
                return f124843a;
            case 6:
                C63010eb ebVar = f124844b;
                if (ebVar == null) {
                    synchronized (C48264bu.class) {
                        ebVar = f124844b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124843a);
                            f124844b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
