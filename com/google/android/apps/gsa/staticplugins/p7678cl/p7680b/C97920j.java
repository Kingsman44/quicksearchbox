package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.j */
/* compiled from: PG */
public final class C97920j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97920j f273426e;

    /* renamed from: f */
    private static volatile C63010eb f273427f;

    /* renamed from: a */
    public int f273428a;

    /* renamed from: b */
    public String f273429b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f273430c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f273431d = BuildConfig.FLAVOR;

    static {
        C97920j jVar = new C97920j();
        f273426e = jVar;
        C62942bv.registerDefaultInstance(C97920j.class, jVar);
    }

    private C97920j() {
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
                return newMessageInfo(f273426e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C97920j();
            case 4:
                return new C97919i();
            case 5:
                return f273426e;
            case 6:
                C63010eb ebVar = f273427f;
                if (ebVar == null) {
                    synchronized (C97920j.class) {
                        ebVar = f273427f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273426e);
                            f273427f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
