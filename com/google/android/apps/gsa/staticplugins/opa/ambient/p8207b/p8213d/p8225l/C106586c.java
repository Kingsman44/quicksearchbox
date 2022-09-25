package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.c */
/* compiled from: PG */
public final class C106586c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106586c f297181c;

    /* renamed from: d */
    private static volatile C63010eb f297182d;

    /* renamed from: a */
    public int f297183a;

    /* renamed from: b */
    public int f297184b;

    static {
        C106586c cVar = new C106586c();
        f297181c = cVar;
        C62942bv.registerDefaultInstance(C106586c.class, cVar);
    }

    private C106586c() {
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
                return newMessageInfo(f297181c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C106585b.f297180a});
            case 3:
                return new C106586c();
            case 4:
                return new C106584a();
            case 5:
                return f297181c;
            case 6:
                C63010eb ebVar = f297182d;
                if (ebVar == null) {
                    synchronized (C106586c.class) {
                        ebVar = f297182d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297181c);
                            f297182d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
