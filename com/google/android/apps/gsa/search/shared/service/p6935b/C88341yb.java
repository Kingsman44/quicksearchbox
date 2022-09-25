package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.yb */
/* compiled from: PG */
public final class C88341yb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88341yb f238907d;

    /* renamed from: e */
    private static volatile C63010eb f238908e;

    /* renamed from: a */
    public int f238909a;

    /* renamed from: b */
    public String f238910b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238911c = BuildConfig.FLAVOR;

    static {
        C88341yb ybVar = new C88341yb();
        f238907d = ybVar;
        C62942bv.registerDefaultInstance(C88341yb.class, ybVar);
    }

    private C88341yb() {
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
                return newMessageInfo(f238907d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88341yb();
            case 4:
                return new C88340ya();
            case 5:
                return f238907d;
            case 6:
                C63010eb ebVar = f238908e;
                if (ebVar == null) {
                    synchronized (C88341yb.class) {
                        ebVar = f238908e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238907d);
                            f238908e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
