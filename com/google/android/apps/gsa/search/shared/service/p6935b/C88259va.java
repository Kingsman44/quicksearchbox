package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.va */
/* compiled from: PG */
public final class C88259va extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88259va f238721e;

    /* renamed from: f */
    private static volatile C63010eb f238722f;

    /* renamed from: a */
    public int f238723a;

    /* renamed from: b */
    public int f238724b;

    /* renamed from: c */
    public String f238725c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f238726d = BuildConfig.FLAVOR;

    static {
        C88259va vaVar = new C88259va();
        f238721e = vaVar;
        C62942bv.registerDefaultInstance(C88259va.class, vaVar);
    }

    private C88259va() {
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
                return newMessageInfo(f238721e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88259va();
            case 4:
                return new C88257uz();
            case 5:
                return f238721e;
            case 6:
                C63010eb ebVar = f238722f;
                if (ebVar == null) {
                    synchronized (C88259va.class) {
                        ebVar = f238722f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238721e);
                            f238722f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
