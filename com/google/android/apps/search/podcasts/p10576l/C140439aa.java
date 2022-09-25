package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.aa */
/* compiled from: PG */
public final class C140439aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C140439aa f381480d;

    /* renamed from: e */
    private static volatile C63010eb f381481e;

    /* renamed from: a */
    public boolean f381482a;

    /* renamed from: b */
    public long f381483b;

    /* renamed from: c */
    public boolean f381484c;

    static {
        C140439aa aaVar = new C140439aa();
        f381480d = aaVar;
        C62942bv.registerDefaultInstance(C140439aa.class, aaVar);
    }

    private C140439aa() {
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
                return newMessageInfo(f381480d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C140439aa();
            case 4:
                return new C140514z();
            case 5:
                return f381480d;
            case 6:
                C63010eb ebVar = f381481e;
                if (ebVar == null) {
                    synchronized (C140439aa.class) {
                        ebVar = f381481e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381480d);
                            f381481e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
