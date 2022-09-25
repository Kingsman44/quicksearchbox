package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.an */
/* compiled from: PG */
public final class C138179an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138179an f375963d;

    /* renamed from: e */
    private static volatile C63010eb f375964e;

    /* renamed from: a */
    public int f375965a;

    /* renamed from: b */
    public String f375966b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f375967c = BuildConfig.FLAVOR;

    static {
        C138179an anVar = new C138179an();
        f375963d = anVar;
        C62942bv.registerDefaultInstance(C138179an.class, anVar);
    }

    private C138179an() {
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
                return newMessageInfo(f375963d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138179an();
            case 4:
                return new C138178am();
            case 5:
                return f375963d;
            case 6:
                C63010eb ebVar = f375964e;
                if (ebVar == null) {
                    synchronized (C138179an.class) {
                        ebVar = f375964e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375963d);
                            f375964e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
