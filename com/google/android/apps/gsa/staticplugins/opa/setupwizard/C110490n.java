package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.n */
/* compiled from: PG */
public final class C110490n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C110490n f308029e;

    /* renamed from: f */
    private static volatile C63010eb f308030f;

    /* renamed from: a */
    public int f308031a;

    /* renamed from: b */
    public int f308032b;

    /* renamed from: c */
    public C110485i f308033c;

    /* renamed from: d */
    public C110489m f308034d;

    static {
        C110490n nVar = new C110490n();
        f308029e = nVar;
        C62942bv.registerDefaultInstance(C110490n.class, nVar);
    }

    private C110490n() {
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
                return newMessageInfo(f308029e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C110486j.f308023a, C45240c.f118157a, "d"});
            case 3:
                return new C110490n();
            case 4:
                return new C110482f();
            case 5:
                return f308029e;
            case 6:
                C63010eb ebVar = f308030f;
                if (ebVar == null) {
                    synchronized (C110490n.class) {
                        ebVar = f308030f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f308029e);
                            f308030f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
