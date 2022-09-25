package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.d */
/* compiled from: PG */
public final class C101550d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C101550d f283389c;

    /* renamed from: d */
    private static volatile C63010eb f283390d;

    /* renamed from: a */
    public int f283391a;

    /* renamed from: b */
    public int f283392b;

    static {
        C101550d dVar = new C101550d();
        f283389c = dVar;
        C62942bv.registerDefaultInstance(C101550d.class, dVar);
    }

    private C101550d() {
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
                return newMessageInfo(f283389c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C101548b.m167927b()});
            case 3:
                return new C101550d();
            case 4:
                return new C101549c();
            case 5:
                return f283389c;
            case 6:
                C63010eb ebVar = f283390d;
                if (ebVar == null) {
                    synchronized (C101550d.class) {
                        ebVar = f283390d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f283389c);
                            f283390d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
