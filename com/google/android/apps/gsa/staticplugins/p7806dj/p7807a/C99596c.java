package com.google.android.apps.gsa.staticplugins.p7806dj.p7807a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.a.c */
/* compiled from: PG */
public final class C99596c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C99596c f278716f;

    /* renamed from: g */
    private static volatile C63010eb f278717g;

    /* renamed from: a */
    public int f278718a;

    /* renamed from: b */
    public String f278719b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f278720c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f278721d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f278722e = BuildConfig.FLAVOR;

    static {
        C99596c cVar = new C99596c();
        f278716f = cVar;
        C62942bv.registerDefaultInstance(C99596c.class, cVar);
    }

    private C99596c() {
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
                return newMessageInfo(f278716f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C99596c();
            case 4:
                return new C99595b();
            case 5:
                return f278716f;
            case 6:
                C63010eb ebVar = f278717g;
                if (ebVar == null) {
                    synchronized (C99596c.class) {
                        ebVar = f278717g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278716f);
                            f278717g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
