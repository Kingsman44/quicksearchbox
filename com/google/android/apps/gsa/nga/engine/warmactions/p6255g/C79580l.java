package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.l */
/* compiled from: PG */
public final class C79580l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79580l f218352d;

    /* renamed from: e */
    private static volatile C63010eb f218353e;

    /* renamed from: a */
    public int f218354a;

    /* renamed from: b */
    public String f218355b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f218356c = BuildConfig.FLAVOR;

    static {
        C79580l lVar = new C79580l();
        f218352d = lVar;
        C62942bv.registerDefaultInstance(C79580l.class, lVar);
    }

    private C79580l() {
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
                return newMessageInfo(f218352d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C79580l();
            case 4:
                return new C79579k();
            case 5:
                return f218352d;
            case 6:
                C63010eb ebVar = f218353e;
                if (ebVar == null) {
                    synchronized (C79580l.class) {
                        ebVar = f218353e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218352d);
                            f218353e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
