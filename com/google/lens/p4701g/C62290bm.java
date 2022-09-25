package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bm */
/* compiled from: PG */
public final class C62290bm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62290bm f168165a;

    /* renamed from: b */
    private static volatile C63010eb f168166b;

    static {
        C62290bm bmVar = new C62290bm();
        f168165a = bmVar;
        C62942bv.registerDefaultInstance(C62290bm.class, bmVar);
    }

    private C62290bm() {
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
                return newMessageInfo(f168165a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62290bm();
            case 4:
                return new C62289bl();
            case 5:
                return f168165a;
            case 6:
                C63010eb ebVar = f168166b;
                if (ebVar == null) {
                    synchronized (C62290bm.class) {
                        ebVar = f168166b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168165a);
                            f168166b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
