package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.av */
/* compiled from: PG */
public final class C62043av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62043av f167621a;

    /* renamed from: b */
    private static volatile C63010eb f167622b;

    static {
        C62043av avVar = new C62043av();
        f167621a = avVar;
        C62942bv.registerDefaultInstance(C62043av.class, avVar);
    }

    private C62043av() {
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
                return newMessageInfo(f167621a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62043av();
            case 4:
                return new C62042au();
            case 5:
                return f167621a;
            case 6:
                C63010eb ebVar = f167622b;
                if (ebVar == null) {
                    synchronized (C62043av.class) {
                        ebVar = f167622b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167621a);
                            f167622b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
