package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.u */
/* compiled from: PG */
public final class C8568u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8568u f29679a;

    /* renamed from: b */
    private static volatile C63010eb f29680b;

    static {
        C8568u uVar = new C8568u();
        f29679a = uVar;
        C62942bv.registerDefaultInstance(C8568u.class, uVar);
    }

    private C8568u() {
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
                return newMessageInfo(f29679a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8568u();
            case 4:
                return new C8567t();
            case 5:
                return f29679a;
            case 6:
                C63010eb ebVar = f29680b;
                if (ebVar == null) {
                    synchronized (C8568u.class) {
                        ebVar = f29680b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29679a);
                            f29680b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
