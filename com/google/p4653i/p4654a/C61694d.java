package com.google.p4653i.p4654a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.d */
/* compiled from: PG */
public final class C61694d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61694d f166676a;

    /* renamed from: b */
    private static volatile C63010eb f166677b;

    static {
        C61694d dVar = new C61694d();
        f166676a = dVar;
        C62942bv.registerDefaultInstance(C61694d.class, dVar);
    }

    private C61694d() {
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
                return newMessageInfo(f166676a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61694d();
            case 4:
                return new C61693c();
            case 5:
                return f166676a;
            case 6:
                C63010eb ebVar = f166677b;
                if (ebVar == null) {
                    synchronized (C61694d.class) {
                        ebVar = f166677b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166676a);
                            f166677b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
