package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.t */
/* compiled from: PG */
public final class C107494t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C107494t f299090e;

    /* renamed from: f */
    private static volatile C63010eb f299091f;

    /* renamed from: a */
    public int f299092a;

    /* renamed from: b */
    public int f299093b = 0;

    /* renamed from: c */
    public Object f299094c;

    /* renamed from: d */
    public String f299095d = BuildConfig.FLAVOR;

    static {
        C107494t tVar = new C107494t();
        f299090e = tVar;
        C62942bv.registerDefaultInstance(C107494t.class, tVar);
    }

    private C107494t() {
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
                return newMessageInfo(f299090e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ွ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C107491q.class});
            case 3:
                return new C107494t();
            case 4:
                return new C107489o();
            case 5:
                return f299090e;
            case 6:
                C63010eb ebVar = f299091f;
                if (ebVar == null) {
                    synchronized (C107494t.class) {
                        ebVar = f299091f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299090e);
                            f299091f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
