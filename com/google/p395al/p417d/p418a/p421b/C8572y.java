package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.y */
/* compiled from: PG */
public final class C8572y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8572y f29683a;

    /* renamed from: b */
    private static volatile C63010eb f29684b;

    static {
        C8572y yVar = new C8572y();
        f29683a = yVar;
        C62942bv.registerDefaultInstance(C8572y.class, yVar);
    }

    private C8572y() {
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
                return newMessageInfo(f29683a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8572y();
            case 4:
                return new C8571x();
            case 5:
                return f29683a;
            case 6:
                C63010eb ebVar = f29684b;
                if (ebVar == null) {
                    synchronized (C8572y.class) {
                        ebVar = f29684b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29683a);
                            f29684b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
