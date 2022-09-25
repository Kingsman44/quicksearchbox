package com.google.p4283bv.p4412k.p4415c.p4416a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.c.a.d */
/* compiled from: PG */
public final class C57846d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57846d f154549a;

    /* renamed from: b */
    private static volatile C63010eb f154550b;

    static {
        C57846d dVar = new C57846d();
        f154549a = dVar;
        C62942bv.registerDefaultInstance(C57846d.class, dVar);
    }

    private C57846d() {
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
                return newMessageInfo(f154549a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57846d();
            case 4:
                return new C57845c();
            case 5:
                return f154549a;
            case 6:
                C63010eb ebVar = f154550b;
                if (ebVar == null) {
                    synchronized (C57846d.class) {
                        ebVar = f154550b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154549a);
                            f154550b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
