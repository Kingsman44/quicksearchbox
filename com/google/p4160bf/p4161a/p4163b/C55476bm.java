package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.bm */
/* compiled from: PG */
public final class C55476bm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55476bm f146358a;

    /* renamed from: b */
    private static volatile C63010eb f146359b;

    static {
        C55476bm bmVar = new C55476bm();
        f146358a = bmVar;
        C62942bv.registerDefaultInstance(C55476bm.class, bmVar);
    }

    private C55476bm() {
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
                return newMessageInfo(f146358a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55476bm();
            case 4:
                return new C55475bl();
            case 5:
                return f146358a;
            case 6:
                C63010eb ebVar = f146359b;
                if (ebVar == null) {
                    synchronized (C55476bm.class) {
                        ebVar = f146359b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146358a);
                            f146359b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
