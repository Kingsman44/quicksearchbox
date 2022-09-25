package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.am */
/* compiled from: PG */
public final class C55603am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55603am f146707a;

    /* renamed from: b */
    private static volatile C63010eb f146708b;

    static {
        C55603am amVar = new C55603am();
        f146707a = amVar;
        C62942bv.registerDefaultInstance(C55603am.class, amVar);
    }

    private C55603am() {
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
                return newMessageInfo(f146707a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55603am();
            case 4:
                return new C55602al();
            case 5:
                return f146707a;
            case 6:
                C63010eb ebVar = f146708b;
                if (ebVar == null) {
                    synchronized (C55603am.class) {
                        ebVar = f146708b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146707a);
                            f146708b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
