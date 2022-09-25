package com.google.android.apps.search.googleapp.discover.p10244v;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.ag */
/* compiled from: PG */
public final class C135135ag extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C135135ag f368062g;

    /* renamed from: h */
    private static volatile C63010eb f368063h;

    /* renamed from: a */
    public int f368064a;

    /* renamed from: b */
    public C63042fg f368065b;

    /* renamed from: c */
    public String f368066c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f368067d;

    /* renamed from: e */
    public int f368068e;

    /* renamed from: f */
    public int f368069f;

    static {
        C135135ag agVar = new C135135ag();
        f368062g = agVar;
        C62942bv.registerDefaultInstance(C135135ag.class, agVar);
    }

    private C135135ag() {
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
                return newMessageInfo(f368062g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004င\u0002\u0005င\u0003\u0006င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C135135ag();
            case 4:
                return new C135134af();
            case 5:
                return f368062g;
            case 6:
                C63010eb ebVar = f368063h;
                if (ebVar == null) {
                    synchronized (C135135ag.class) {
                        ebVar = f368063h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f368062g);
                            f368063h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
