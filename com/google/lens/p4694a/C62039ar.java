package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.ar */
/* compiled from: PG */
public final class C62039ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62039ar f167616a;

    /* renamed from: b */
    private static volatile C63010eb f167617b;

    static {
        C62039ar arVar = new C62039ar();
        f167616a = arVar;
        C62942bv.registerDefaultInstance(C62039ar.class, arVar);
    }

    private C62039ar() {
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
                return newMessageInfo(f167616a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62039ar();
            case 4:
                return new C62038aq();
            case 5:
                return f167616a;
            case 6:
                C63010eb ebVar = f167617b;
                if (ebVar == null) {
                    synchronized (C62039ar.class) {
                        ebVar = f167617b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167616a);
                            f167617b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
