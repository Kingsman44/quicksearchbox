package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.yk */
/* compiled from: PG */
public final class C88350yk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88350yk f238930e;

    /* renamed from: f */
    private static volatile C63010eb f238931f;

    /* renamed from: a */
    public int f238932a;

    /* renamed from: b */
    public String f238933b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f238934c;

    /* renamed from: d */
    public int f238935d;

    static {
        C88350yk ykVar = new C88350yk();
        f238930e = ykVar;
        C62942bv.registerDefaultInstance(C88350yk.class, ykVar);
    }

    private C88350yk() {
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
                return newMessageInfo(f238930e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88350yk();
            case 4:
                return new C88349yj();
            case 5:
                return f238930e;
            case 6:
                C63010eb ebVar = f238931f;
                if (ebVar == null) {
                    synchronized (C88350yk.class) {
                        ebVar = f238931f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238930e);
                            f238931f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
