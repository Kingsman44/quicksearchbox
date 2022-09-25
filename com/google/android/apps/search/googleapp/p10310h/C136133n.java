package com.google.android.apps.search.googleapp.p10310h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.h.n */
/* compiled from: PG */
public final class C136133n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C136133n f370758e;

    /* renamed from: f */
    private static volatile C63010eb f370759f;

    /* renamed from: a */
    public int f370760a;

    /* renamed from: b */
    public String f370761b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f370762c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f370763d = BuildConfig.FLAVOR;

    static {
        C136133n nVar = new C136133n();
        f370758e = nVar;
        C62942bv.registerDefaultInstance(C136133n.class, nVar);
    }

    private C136133n() {
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
                return newMessageInfo(f370758e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C136133n();
            case 4:
                return new C136132m();
            case 5:
                return f370758e;
            case 6:
                C63010eb ebVar = f370759f;
                if (ebVar == null) {
                    synchronized (C136133n.class) {
                        ebVar = f370759f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370758e);
                            f370759f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
