package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.vw */
/* compiled from: PG */
public final class C88281vw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88281vw f238765d;

    /* renamed from: e */
    private static volatile C63010eb f238766e;

    /* renamed from: a */
    public int f238767a;

    /* renamed from: b */
    public String f238768b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f238769c;

    static {
        C88281vw vwVar = new C88281vw();
        f238765d = vwVar;
        C62942bv.registerDefaultInstance(C88281vw.class, vwVar);
    }

    private C88281vw() {
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
                return newMessageInfo(f238765d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88281vw();
            case 4:
                return new C88280vv();
            case 5:
                return f238765d;
            case 6:
                C63010eb ebVar = f238766e;
                if (ebVar == null) {
                    synchronized (C88281vw.class) {
                        ebVar = f238766e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238765d);
                            f238766e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
