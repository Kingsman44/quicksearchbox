package com.google.apps.tiktok.p3674l.p3680d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.l.d.c */
/* compiled from: PG */
public final class C47404c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C47404c f123130d;

    /* renamed from: f */
    private static volatile C63010eb f123131f;

    /* renamed from: a */
    public String f123132a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f123133b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f123134c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f123135e;

    static {
        C47404c cVar = new C47404c();
        f123130d = cVar;
        C62942bv.registerDefaultInstance(C47404c.class, cVar);
    }

    private C47404c() {
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
                return newMessageInfo(f123130d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C47404c();
            case 4:
                return new C47403b();
            case 5:
                return f123130d;
            case 6:
                C63010eb ebVar = f123131f;
                if (ebVar == null) {
                    synchronized (C47404c.class) {
                        ebVar = f123131f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123130d);
                            f123131f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
