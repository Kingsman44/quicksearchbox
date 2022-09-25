package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qg */
/* compiled from: PG */
public final class C88130qg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88130qg f238240d;

    /* renamed from: e */
    private static volatile C63010eb f238241e;

    /* renamed from: a */
    public int f238242a;

    /* renamed from: b */
    public String f238243b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238244c = BuildConfig.FLAVOR;

    static {
        C88130qg qgVar = new C88130qg();
        f238240d = qgVar;
        C62942bv.registerDefaultInstance(C88130qg.class, qgVar);
    }

    private C88130qg() {
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
                return newMessageInfo(f238240d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88130qg();
            case 4:
                return new C88129qf();
            case 5:
                return f238240d;
            case 6:
                C63010eb ebVar = f238241e;
                if (ebVar == null) {
                    synchronized (C88130qg.class) {
                        ebVar = f238241e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238240d);
                            f238241e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
