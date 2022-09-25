package com.google.p4242bp.p4267h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.l */
/* compiled from: PG */
public final class C56405l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56405l f150424e;

    /* renamed from: f */
    private static volatile C63010eb f150425f;

    /* renamed from: a */
    public int f150426a;

    /* renamed from: b */
    public String f150427b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f150428c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f150429d = BuildConfig.FLAVOR;

    static {
        C56405l lVar = new C56405l();
        f150424e = lVar;
        C62942bv.registerDefaultInstance(C56405l.class, lVar);
    }

    private C56405l() {
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
                return newMessageInfo(f150424e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56405l();
            case 4:
                return new C56404k();
            case 5:
                return f150424e;
            case 6:
                C63010eb ebVar = f150425f;
                if (ebVar == null) {
                    synchronized (C56405l.class) {
                        ebVar = f150425f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150424e);
                            f150425f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
