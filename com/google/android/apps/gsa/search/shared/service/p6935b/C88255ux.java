package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ux */
/* compiled from: PG */
public final class C88255ux extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88255ux f238714d;

    /* renamed from: e */
    private static volatile C63010eb f238715e;

    /* renamed from: a */
    public int f238716a;

    /* renamed from: b */
    public String f238717b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238718c = BuildConfig.FLAVOR;

    static {
        C88255ux uxVar = new C88255ux();
        f238714d = uxVar;
        C62942bv.registerDefaultInstance(C88255ux.class, uxVar);
    }

    private C88255ux() {
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
                return newMessageInfo(f238714d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88255ux();
            case 4:
                return new C88254uw();
            case 5:
                return f238714d;
            case 6:
                C63010eb ebVar = f238715e;
                if (ebVar == null) {
                    synchronized (C88255ux.class) {
                        ebVar = f238715e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238714d);
                            f238715e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
