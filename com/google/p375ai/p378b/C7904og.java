package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.og */
/* compiled from: PG */
public final class C7904og extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7904og f27779a;

    /* renamed from: b */
    private static volatile C63010eb f27780b;

    static {
        C7904og ogVar = new C7904og();
        f27779a = ogVar;
        C62942bv.registerDefaultInstance(C7904og.class, ogVar);
    }

    private C7904og() {
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
                return newMessageInfo(f27779a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7904og();
            case 4:
                return new C7903of();
            case 5:
                return f27779a;
            case 6:
                C63010eb ebVar = f27780b;
                if (ebVar == null) {
                    synchronized (C7904og.class) {
                        ebVar = f27780b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27779a);
                            f27780b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
