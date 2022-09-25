package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.j */
/* compiled from: PG */
public final class C62229j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62229j f168021a;

    /* renamed from: b */
    private static volatile C63010eb f168022b;

    static {
        C62229j jVar = new C62229j();
        f168021a = jVar;
        C62942bv.registerDefaultInstance(C62229j.class, jVar);
    }

    private C62229j() {
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
                return newMessageInfo(f168021a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62229j();
            case 4:
                return new C62228i();
            case 5:
                return f168021a;
            case 6:
                C63010eb ebVar = f168022b;
                if (ebVar == null) {
                    synchronized (C62229j.class) {
                        ebVar = f168022b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168021a);
                            f168022b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
