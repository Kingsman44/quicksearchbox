package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8223j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.j.d */
/* compiled from: PG */
public final class C106570d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106570d f297154c;

    /* renamed from: d */
    private static volatile C63010eb f297155d;

    /* renamed from: a */
    public int f297156a;

    /* renamed from: b */
    public int f297157b;

    static {
        C106570d dVar = new C106570d();
        f297154c = dVar;
        C62942bv.registerDefaultInstance(C106570d.class, dVar);
    }

    private C106570d() {
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
                return newMessageInfo(f297154c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C106568b.f297153a});
            case 3:
                return new C106570d();
            case 4:
                return new C106567a();
            case 5:
                return f297154c;
            case 6:
                C63010eb ebVar = f297155d;
                if (ebVar == null) {
                    synchronized (C106570d.class) {
                        ebVar = f297155d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297154c);
                            f297155d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
