package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.n */
/* compiled from: PG */
public final class C8561n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8561n f29658a;

    /* renamed from: b */
    private static volatile C63010eb f29659b;

    static {
        C8561n nVar = new C8561n();
        f29658a = nVar;
        C62942bv.registerDefaultInstance(C8561n.class, nVar);
    }

    private C8561n() {
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
                return newMessageInfo(f29658a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8561n();
            case 4:
                return new C8560m();
            case 5:
                return f29658a;
            case 6:
                C63010eb ebVar = f29659b;
                if (ebVar == null) {
                    synchronized (C8561n.class) {
                        ebVar = f29659b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29658a);
                            f29659b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
