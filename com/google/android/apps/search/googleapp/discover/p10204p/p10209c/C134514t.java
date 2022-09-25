package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.t */
/* compiled from: PG */
public final class C134514t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134514t f366325c;

    /* renamed from: d */
    private static volatile C63010eb f366326d;

    /* renamed from: a */
    public int f366327a = 0;

    /* renamed from: b */
    public Object f366328b;

    static {
        C134514t tVar = new C134514t();
        f366325c = tVar;
        C62942bv.registerDefaultInstance(C134514t.class, tVar);
    }

    private C134514t() {
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
                return newMessageInfo(f366325c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C134520z.class, C134518x.class, C134516v.class});
            case 3:
                return new C134514t();
            case 4:
                return new C134513s();
            case 5:
                return f366325c;
            case 6:
                C63010eb ebVar = f366326d;
                if (ebVar == null) {
                    synchronized (C134514t.class) {
                        ebVar = f366326d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366325c);
                            f366326d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
