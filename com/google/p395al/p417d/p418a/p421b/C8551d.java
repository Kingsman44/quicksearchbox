package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.d */
/* compiled from: PG */
public final class C8551d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8551d f29648a;

    /* renamed from: b */
    private static volatile C63010eb f29649b;

    static {
        C8551d dVar = new C8551d();
        f29648a = dVar;
        C62942bv.registerDefaultInstance(C8551d.class, dVar);
    }

    private C8551d() {
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
                return newMessageInfo(f29648a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8551d();
            case 4:
                return new C8550c();
            case 5:
                return f29648a;
            case 6:
                C63010eb ebVar = f29649b;
                if (ebVar == null) {
                    synchronized (C8551d.class) {
                        ebVar = f29649b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29648a);
                            f29649b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
