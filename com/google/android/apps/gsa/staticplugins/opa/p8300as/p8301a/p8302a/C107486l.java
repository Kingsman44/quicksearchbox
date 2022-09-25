package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.l */
/* compiled from: PG */
public final class C107486l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C107486l f299077d;

    /* renamed from: e */
    private static volatile C63010eb f299078e;

    /* renamed from: a */
    public int f299079a;

    /* renamed from: b */
    public String f299080b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f299081c;

    static {
        C107486l lVar = new C107486l();
        f299077d = lVar;
        C62942bv.registerDefaultInstance(C107486l.class, lVar);
    }

    private C107486l() {
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
                return newMessageInfo(f299077d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C107486l();
            case 4:
                return new C107485k();
            case 5:
                return f299077d;
            case 6:
                C63010eb ebVar = f299078e;
                if (ebVar == null) {
                    synchronized (C107486l.class) {
                        ebVar = f299078e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299077d);
                            f299078e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
