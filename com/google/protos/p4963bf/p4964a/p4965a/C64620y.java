package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.y */
/* compiled from: PG */
public final class C64620y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64620y f175169a;

    /* renamed from: b */
    private static volatile C63010eb f175170b;

    static {
        C64620y yVar = new C64620y();
        f175169a = yVar;
        C62942bv.registerDefaultInstance(C64620y.class, yVar);
    }

    private C64620y() {
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
                return newMessageInfo(f175169a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64620y();
            case 4:
                return new C64619x();
            case 5:
                return f175169a;
            case 6:
                C63010eb ebVar = f175170b;
                if (ebVar == null) {
                    synchronized (C64620y.class) {
                        ebVar = f175170b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175169a);
                            f175170b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
