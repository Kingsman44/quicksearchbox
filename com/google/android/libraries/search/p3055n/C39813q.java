package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.q */
/* compiled from: PG */
public final class C39813q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C39813q f104698b;

    /* renamed from: c */
    private static volatile C63010eb f104699c;

    /* renamed from: a */
    public C62995dn f104700a = C62995dn.f170057a;

    static {
        C39813q qVar = new C39813q();
        f104698b = qVar;
        C62942bv.registerDefaultInstance(C39813q.class, qVar);
    }

    private C39813q() {
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
                return newMessageInfo(f104698b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C39796j.f104656a});
            case 3:
                return new C39813q();
            case 4:
                return new C39778i();
            case 5:
                return f104698b;
            case 6:
                C63010eb ebVar = f104699c;
                if (ebVar == null) {
                    synchronized (C39813q.class) {
                        ebVar = f104699c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104698b);
                            f104699c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
