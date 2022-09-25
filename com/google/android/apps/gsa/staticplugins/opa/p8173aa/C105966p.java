package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.p */
/* compiled from: PG */
public final class C105966p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C105966p f295853e;

    /* renamed from: f */
    private static volatile C63010eb f295854f;

    /* renamed from: a */
    public int f295855a;

    /* renamed from: b */
    public String f295856b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f295857c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f295858d = BuildConfig.FLAVOR;

    static {
        C105966p pVar = new C105966p();
        f295853e = pVar;
        C62942bv.registerDefaultInstance(C105966p.class, pVar);
    }

    private C105966p() {
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
                return newMessageInfo(f295853e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C105966p();
            case 4:
                return new C105965o();
            case 5:
                return f295853e;
            case 6:
                C63010eb ebVar = f295854f;
                if (ebVar == null) {
                    synchronized (C105966p.class) {
                        ebVar = f295854f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295853e);
                            f295854f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
