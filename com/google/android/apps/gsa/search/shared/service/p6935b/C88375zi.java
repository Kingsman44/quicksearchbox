package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.zi */
/* compiled from: PG */
public final class C88375zi extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88375zi f238978e;

    /* renamed from: f */
    private static volatile C63010eb f238979f;

    /* renamed from: a */
    public int f238980a;

    /* renamed from: b */
    public int f238981b;

    /* renamed from: c */
    public String f238982c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f238983d;

    static {
        C88375zi ziVar = new C88375zi();
        f238978e = ziVar;
        C62942bv.registerDefaultInstance(C88375zi.class, ziVar);
    }

    private C88375zi() {
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
                return newMessageInfo(f238978e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", C88373zg.f238977a, C45240c.f118157a, "d"});
            case 3:
                return new C88375zi();
            case 4:
                return new C88372zf();
            case 5:
                return f238978e;
            case 6:
                C63010eb ebVar = f238979f;
                if (ebVar == null) {
                    synchronized (C88375zi.class) {
                        ebVar = f238979f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238978e);
                            f238979f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
