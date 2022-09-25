package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n */
/* compiled from: PG */
public final class C138263n extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C138263n f376169h;

    /* renamed from: i */
    private static volatile C63010eb f376170i;

    /* renamed from: a */
    public int f376171a;

    /* renamed from: b */
    public String f376172b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f376173c;

    /* renamed from: d */
    public boolean f376174d;

    /* renamed from: e */
    public boolean f376175e;

    /* renamed from: f */
    public int f376176f;

    /* renamed from: g */
    public long f376177g;

    static {
        C138263n nVar = new C138263n();
        f376169h = nVar;
        C62942bv.registerDefaultInstance(C138263n.class, nVar);
    }

    private C138263n() {
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
                return newMessageInfo(f376169h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဌ\u0004\u0005ဃ\u0005\u0006င\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C138171af.m224537b(), C30325g.f82003a, C45240c.f118157a});
            case 3:
                return new C138263n();
            case 4:
                return new C138262m();
            case 5:
                return f376169h;
            case 6:
                C63010eb ebVar = f376170i;
                if (ebVar == null) {
                    synchronized (C138263n.class) {
                        ebVar = f376170i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376169h);
                            f376170i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
