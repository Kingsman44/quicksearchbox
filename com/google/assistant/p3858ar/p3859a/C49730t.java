package com.google.assistant.p3858ar.p3859a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.t */
/* compiled from: PG */
public final class C49730t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49730t f128351a;

    /* renamed from: b */
    private static volatile C63010eb f128352b;

    static {
        C49730t tVar = new C49730t();
        f128351a = tVar;
        C62942bv.registerDefaultInstance(C49730t.class, tVar);
    }

    private C49730t() {
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
                return newMessageInfo(f128351a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49730t();
            case 4:
                return new C49729s();
            case 5:
                return f128351a;
            case 6:
                C63010eb ebVar = f128352b;
                if (ebVar == null) {
                    synchronized (C49730t.class) {
                        ebVar = f128352b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128351a);
                            f128352b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
