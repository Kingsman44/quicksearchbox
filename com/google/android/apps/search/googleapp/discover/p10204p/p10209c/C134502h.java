package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.h */
/* compiled from: PG */
public final class C134502h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C134502h f366287f;

    /* renamed from: g */
    private static volatile C63010eb f366288g;

    /* renamed from: a */
    public int f366289a;

    /* renamed from: b */
    public String f366290b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f366291c;

    /* renamed from: d */
    public int f366292d;

    /* renamed from: e */
    public boolean f366293e;

    static {
        C134502h hVar = new C134502h();
        f366287f = hVar;
        C62942bv.registerDefaultInstance(C134502h.class, hVar);
    }

    private C134502h() {
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
                return newMessageInfo(f366287f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C134502h();
            case 4:
                return new C134501g();
            case 5:
                return f366287f;
            case 6:
                C63010eb ebVar = f366288g;
                if (ebVar == null) {
                    synchronized (C134502h.class) {
                        ebVar = f366288g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366287f);
                            f366288g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
