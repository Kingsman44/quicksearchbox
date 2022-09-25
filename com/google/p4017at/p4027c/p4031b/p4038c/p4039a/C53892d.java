package com.google.p4017at.p4027c.p4031b.p4038c.p4039a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.c.a.d */
/* compiled from: PG */
public final class C53892d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53892d f141423a;

    /* renamed from: b */
    private static volatile C63010eb f141424b;

    static {
        C53892d dVar = new C53892d();
        f141423a = dVar;
        C62942bv.registerDefaultInstance(C53892d.class, dVar);
    }

    private C53892d() {
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
                return newMessageInfo(f141423a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C53892d();
            case 4:
                return new C53891c();
            case 5:
                return f141423a;
            case 6:
                C63010eb ebVar = f141424b;
                if (ebVar == null) {
                    synchronized (C53892d.class) {
                        ebVar = f141424b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141423a);
                            f141424b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
