package com.google.p363ad.p364a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.c */
/* compiled from: PG */
public final class C6679c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C6679c f19952a;

    /* renamed from: b */
    private static volatile C63010eb f19953b;

    static {
        C6679c cVar = new C6679c();
        f19952a = cVar;
        C62942bv.registerDefaultInstance(C6679c.class, cVar);
    }

    private C6679c() {
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
                return newMessageInfo(f19952a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C6679c();
            case 4:
                return new C6678b();
            case 5:
                return f19952a;
            case 6:
                C63010eb ebVar = f19953b;
                if (ebVar == null) {
                    synchronized (C6679c.class) {
                        ebVar = f19953b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19952a);
                            f19953b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
