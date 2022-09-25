package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ap */
/* compiled from: PG */
public final class C138181ap extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C138181ap f375968e;

    /* renamed from: f */
    private static volatile C63010eb f375969f;

    /* renamed from: a */
    public int f375970a;

    /* renamed from: b */
    public String f375971b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f375972c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f375973d = BuildConfig.FLAVOR;

    static {
        C138181ap apVar = new C138181ap();
        f375968e = apVar;
        C62942bv.registerDefaultInstance(C138181ap.class, apVar);
    }

    private C138181ap() {
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
                return newMessageInfo(f375968e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C138181ap();
            case 4:
                return new C138180ao();
            case 5:
                return f375968e;
            case 6:
                C63010eb ebVar = f375969f;
                if (ebVar == null) {
                    synchronized (C138181ap.class) {
                        ebVar = f375969f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375968e);
                            f375969f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
