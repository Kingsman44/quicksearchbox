package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.c */
/* compiled from: PG */
public final class C55644c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55644c f146810a;

    /* renamed from: b */
    private static volatile C63010eb f146811b;

    static {
        C55644c cVar = new C55644c();
        f146810a = cVar;
        C62942bv.registerDefaultInstance(C55644c.class, cVar);
    }

    private C55644c() {
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
                return newMessageInfo(f146810a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55644c();
            case 4:
                return new C55617b();
            case 5:
                return f146810a;
            case 6:
                C63010eb ebVar = f146811b;
                if (ebVar == null) {
                    synchronized (C55644c.class) {
                        ebVar = f146811b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146810a);
                            f146811b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
