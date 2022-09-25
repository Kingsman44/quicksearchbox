package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.d */
/* compiled from: PG */
public final class C109927d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C109927d f306290e;

    /* renamed from: f */
    private static volatile C63010eb f306291f;

    /* renamed from: a */
    public int f306292a;

    /* renamed from: b */
    public int f306293b;

    /* renamed from: c */
    public String f306294c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f306295d = BuildConfig.FLAVOR;

    static {
        C109927d dVar = new C109927d();
        f306290e = dVar;
        C62942bv.registerDefaultInstance(C109927d.class, dVar);
    }

    private C109927d() {
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
                return newMessageInfo(f306290e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C109926c.m183098b(), C45240c.f118157a, "d"});
            case 3:
                return new C109927d();
            case 4:
                return new C109874a();
            case 5:
                return f306290e;
            case 6:
                C63010eb ebVar = f306291f;
                if (ebVar == null) {
                    synchronized (C109927d.class) {
                        ebVar = f306291f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f306290e);
                            f306291f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
