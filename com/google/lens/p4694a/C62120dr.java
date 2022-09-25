package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dr */
/* compiled from: PG */
public final class C62120dr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62120dr f167747a;

    /* renamed from: b */
    private static volatile C63010eb f167748b;

    static {
        C62120dr drVar = new C62120dr();
        f167747a = drVar;
        C62942bv.registerDefaultInstance(C62120dr.class, drVar);
    }

    private C62120dr() {
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
                return newMessageInfo(f167747a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62120dr();
            case 4:
                return new C62119dq();
            case 5:
                return f167747a;
            case 6:
                C63010eb ebVar = f167748b;
                if (ebVar == null) {
                    synchronized (C62120dr.class) {
                        ebVar = f167748b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167747a);
                            f167748b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
