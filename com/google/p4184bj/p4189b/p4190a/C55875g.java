package com.google.p4184bj.p4189b.p4190a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.a.g */
/* compiled from: PG */
public final class C55875g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55875g f148685a;

    /* renamed from: b */
    private static volatile C63010eb f148686b;

    static {
        C55875g gVar = new C55875g();
        f148685a = gVar;
        C62942bv.registerDefaultInstance(C55875g.class, gVar);
    }

    private C55875g() {
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
                return newMessageInfo(f148685a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55875g();
            case 4:
                return new C55874f();
            case 5:
                return f148685a;
            case 6:
                C63010eb ebVar = f148686b;
                if (ebVar == null) {
                    synchronized (C55875g.class) {
                        ebVar = f148686b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148685a);
                            f148686b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
