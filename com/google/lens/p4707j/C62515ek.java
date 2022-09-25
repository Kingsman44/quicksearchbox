package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ek */
/* compiled from: PG */
public final class C62515ek extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62515ek f168783a;

    /* renamed from: b */
    private static volatile C63010eb f168784b;

    static {
        C62515ek ekVar = new C62515ek();
        f168783a = ekVar;
        C62942bv.registerDefaultInstance(C62515ek.class, ekVar);
    }

    private C62515ek() {
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
                return newMessageInfo(f168783a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62515ek();
            case 4:
                return new C62514ej();
            case 5:
                return f168783a;
            case 6:
                C63010eb ebVar = f168784b;
                if (ebVar == null) {
                    synchronized (C62515ek.class) {
                        ebVar = f168784b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168783a);
                            f168784b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
