package com.google.android.apps.search.googleapp.search.p10405b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.b.c */
/* compiled from: PG */
public final class C137398c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C137398c f373717f;

    /* renamed from: g */
    private static volatile C63010eb f373718g;

    /* renamed from: a */
    public int f373719a;

    /* renamed from: b */
    public String f373720b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f373721c;

    /* renamed from: d */
    public String f373722d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f373723e = BuildConfig.FLAVOR;

    static {
        C137398c cVar = new C137398c();
        f373717f = cVar;
        C62942bv.registerDefaultInstance(C137398c.class, cVar);
    }

    private C137398c() {
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
                return newMessageInfo(f373717f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဇ\u0001\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C137398c();
            case 4:
                return new C137397b();
            case 5:
                return f373717f;
            case 6:
                C63010eb ebVar = f373718g;
                if (ebVar == null) {
                    synchronized (C137398c.class) {
                        ebVar = f373718g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373717f);
                            f373718g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
