package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.j */
/* compiled from: PG */
public final class C139010j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139010j f378052d;

    /* renamed from: e */
    private static volatile C63010eb f378053e;

    /* renamed from: a */
    public int f378054a;

    /* renamed from: b */
    public C63088z f378055b = C63088z.f170246b;

    /* renamed from: c */
    public String f378056c = BuildConfig.FLAVOR;

    static {
        C139010j jVar = new C139010j();
        f378052d = jVar;
        C62942bv.registerDefaultInstance(C139010j.class, jVar);
    }

    private C139010j() {
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
                return newMessageInfo(f378052d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C139010j();
            case 4:
                return new C139009i();
            case 5:
                return f378052d;
            case 6:
                C63010eb ebVar = f378053e;
                if (ebVar == null) {
                    synchronized (C139010j.class) {
                        ebVar = f378053e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378052d);
                            f378053e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
