package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.au */
/* compiled from: PG */
public final class C138186au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138186au f375981d;

    /* renamed from: e */
    private static volatile C63010eb f375982e;

    /* renamed from: a */
    public int f375983a;

    /* renamed from: b */
    public String f375984b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f375985c;

    static {
        C138186au auVar = new C138186au();
        f375981d = auVar;
        C62942bv.registerDefaultInstance(C138186au.class, auVar);
    }

    private C138186au() {
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
                return newMessageInfo(f375981d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C138185at.m224563b()});
            case 3:
                return new C138186au();
            case 4:
                return new C138183ar();
            case 5:
                return f375981d;
            case 6:
                C63010eb ebVar = f375982e;
                if (ebVar == null) {
                    synchronized (C138186au.class) {
                        ebVar = f375982e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375981d);
                            f375982e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
