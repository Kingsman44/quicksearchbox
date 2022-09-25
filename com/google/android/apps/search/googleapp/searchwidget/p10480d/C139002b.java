package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.b */
/* compiled from: PG */
public final class C139002b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C139002b f378023f;

    /* renamed from: g */
    private static volatile C63010eb f378024g;

    /* renamed from: a */
    public int f378025a;

    /* renamed from: b */
    public int f378026b;

    /* renamed from: c */
    public String f378027c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f378028d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f378029e = BuildConfig.FLAVOR;

    static {
        C139002b bVar = new C139002b();
        f378023f = bVar;
        C62942bv.registerDefaultInstance(C139002b.class, bVar);
    }

    private C139002b() {
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
                return newMessageInfo(f378023f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C139004d.m225806b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C139002b();
            case 4:
                return new C138996a();
            case 5:
                return f378023f;
            case 6:
                C63010eb ebVar = f378024g;
                if (ebVar == null) {
                    synchronized (C139002b.class) {
                        ebVar = f378024g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378023f);
                            f378024g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
