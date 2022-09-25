package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.t */
/* compiled from: PG */
public final class C48396t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48396t f125090a;

    /* renamed from: b */
    private static volatile C63010eb f125091b;

    static {
        C48396t tVar = new C48396t();
        f125090a = tVar;
        C62942bv.registerDefaultInstance(C48396t.class, tVar);
    }

    private C48396t() {
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
                return newMessageInfo(f125090a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48396t();
            case 4:
                return new C48393s();
            case 5:
                return f125090a;
            case 6:
                C63010eb ebVar = f125091b;
                if (ebVar == null) {
                    synchronized (C48396t.class) {
                        ebVar = f125091b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125090a);
                            f125091b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
