package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.by */
/* compiled from: PG */
public final class C8907by extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8907by f30915a;

    /* renamed from: b */
    private static volatile C63010eb f30916b;

    static {
        C8907by byVar = new C8907by();
        f30915a = byVar;
        C62942bv.registerDefaultInstance(C8907by.class, byVar);
    }

    private C8907by() {
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
                return newMessageInfo(f30915a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8907by();
            case 4:
                return new C8906bx();
            case 5:
                return f30915a;
            case 6:
                C63010eb ebVar = f30916b;
                if (ebVar == null) {
                    synchronized (C8907by.class) {
                        ebVar = f30916b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30915a);
                            f30916b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
