package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.ah */
/* compiled from: PG */
public final class C55934ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55934ah f148897a;

    /* renamed from: b */
    private static volatile C63010eb f148898b;

    static {
        C55934ah ahVar = new C55934ah();
        f148897a = ahVar;
        C62942bv.registerDefaultInstance(C55934ah.class, ahVar);
    }

    private C55934ah() {
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
                return newMessageInfo(f148897a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55934ah();
            case 4:
                return new C55933ag();
            case 5:
                return f148897a;
            case 6:
                C63010eb ebVar = f148898b;
                if (ebVar == null) {
                    synchronized (C55934ah.class) {
                        ebVar = f148898b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148897a);
                            f148898b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
