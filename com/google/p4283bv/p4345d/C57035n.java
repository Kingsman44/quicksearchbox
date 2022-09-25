package com.google.p4283bv.p4345d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.n */
/* compiled from: PG */
public final class C57035n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57035n f152269a;

    /* renamed from: b */
    private static volatile C63010eb f152270b;

    static {
        C57035n nVar = new C57035n();
        f152269a = nVar;
        C62942bv.registerDefaultInstance(C57035n.class, nVar);
    }

    private C57035n() {
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
                return newMessageInfo(f152269a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57035n();
            case 4:
                return new C57034m();
            case 5:
                return f152269a;
            case 6:
                C63010eb ebVar = f152270b;
                if (ebVar == null) {
                    synchronized (C57035n.class) {
                        ebVar = f152270b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152269a);
                            f152270b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
