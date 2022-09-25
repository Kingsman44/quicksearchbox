package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.l */
/* compiled from: PG */
public final class C138261l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C138261l f376163e;

    /* renamed from: f */
    private static volatile C63010eb f376164f;

    /* renamed from: a */
    public int f376165a;

    /* renamed from: b */
    public C63088z f376166b = C63088z.f170246b;

    /* renamed from: c */
    public String f376167c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C138214bv f376168d;

    static {
        C138261l lVar = new C138261l();
        f376163e = lVar;
        C62942bv.registerDefaultInstance(C138261l.class, lVar);
    }

    private C138261l() {
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
                return newMessageInfo(f376163e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C138261l();
            case 4:
                return new C138260k();
            case 5:
                return f376163e;
            case 6:
                C63010eb ebVar = f376164f;
                if (ebVar == null) {
                    synchronized (C138261l.class) {
                        ebVar = f376164f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376163e);
                            f376164f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
