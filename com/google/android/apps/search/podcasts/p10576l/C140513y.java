package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.y */
/* compiled from: PG */
public final class C140513y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C140513y f381639d;

    /* renamed from: e */
    private static volatile C63010eb f381640e;

    /* renamed from: a */
    public long f381641a;

    /* renamed from: b */
    public long f381642b;

    /* renamed from: c */
    public boolean f381643c;

    static {
        C140513y yVar = new C140513y();
        f381639d = yVar;
        C62942bv.registerDefaultInstance(C140513y.class, yVar);
    }

    private C140513y() {
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
                return newMessageInfo(f381639d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C140513y();
            case 4:
                return new C140512x();
            case 5:
                return f381639d;
            case 6:
                C63010eb ebVar = f381640e;
                if (ebVar == null) {
                    synchronized (C140513y.class) {
                        ebVar = f381640e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381639d);
                            f381640e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
