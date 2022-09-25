package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.p */
/* compiled from: PG */
public final class C78814p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C78814p f216922d;

    /* renamed from: e */
    private static volatile C63010eb f216923e;

    /* renamed from: a */
    public long f216924a;

    /* renamed from: b */
    public boolean f216925b;

    /* renamed from: c */
    public boolean f216926c;

    static {
        C78814p pVar = new C78814p();
        f216922d = pVar;
        C62942bv.registerDefaultInstance(C78814p.class, pVar);
    }

    private C78814p() {
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
                return newMessageInfo(f216922d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u0007\u0003\u0002\u0004\u0007", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C78814p();
            case 4:
                return new C78813o();
            case 5:
                return f216922d;
            case 6:
                C63010eb ebVar = f216923e;
                if (ebVar == null) {
                    synchronized (C78814p.class) {
                        ebVar = f216923e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216922d);
                            f216923e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
