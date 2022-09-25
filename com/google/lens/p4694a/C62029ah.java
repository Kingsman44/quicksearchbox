package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.ah */
/* compiled from: PG */
public final class C62029ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62029ah f167603a;

    /* renamed from: b */
    private static volatile C63010eb f167604b;

    static {
        C62029ah ahVar = new C62029ah();
        f167603a = ahVar;
        C62942bv.registerDefaultInstance(C62029ah.class, ahVar);
    }

    private C62029ah() {
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
                return newMessageInfo(f167603a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62029ah();
            case 4:
                return new C62028ag();
            case 5:
                return f167603a;
            case 6:
                C63010eb ebVar = f167604b;
                if (ebVar == null) {
                    synchronized (C62029ah.class) {
                        ebVar = f167604b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167603a);
                            f167604b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
