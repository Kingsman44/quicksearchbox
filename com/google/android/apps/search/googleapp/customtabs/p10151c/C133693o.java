package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.o */
/* compiled from: PG */
public final class C133693o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C133693o f364157f;

    /* renamed from: g */
    private static volatile C63010eb f364158g;

    /* renamed from: a */
    public int f364159a;

    /* renamed from: b */
    public int f364160b;

    /* renamed from: c */
    public boolean f364161c;

    /* renamed from: d */
    public long f364162d;

    /* renamed from: e */
    public String f364163e = BuildConfig.FLAVOR;

    static {
        C133693o oVar = new C133693o();
        f364157f = oVar;
        C62942bv.registerDefaultInstance(C133693o.class, oVar);
    }

    private C133693o() {
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
                return newMessageInfo(f364157f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C133693o();
            case 4:
                return new C133692n();
            case 5:
                return f364157f;
            case 6:
                C63010eb ebVar = f364158g;
                if (ebVar == null) {
                    synchronized (C133693o.class) {
                        ebVar = f364158g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364157f);
                            f364158g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
