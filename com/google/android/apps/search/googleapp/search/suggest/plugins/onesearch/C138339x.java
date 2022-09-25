package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.x */
/* compiled from: PG */
public final class C138339x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138339x f376372d;

    /* renamed from: f */
    private static volatile C63010eb f376373f;

    /* renamed from: a */
    public int f376374a;

    /* renamed from: b */
    public C138246cb f376375b;

    /* renamed from: c */
    public long f376376c;

    /* renamed from: e */
    private int f376377e;

    static {
        C138339x xVar = new C138339x();
        f376372d = xVar;
        C62942bv.registerDefaultInstance(C138339x.class, xVar);
    }

    private C138339x() {
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
                return newMessageInfo(f376372d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဃ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C138339x();
            case 4:
                return new C138338w();
            case 5:
                return f376372d;
            case 6:
                C63010eb ebVar = f376373f;
                if (ebVar == null) {
                    synchronized (C138339x.class) {
                        ebVar = f376373f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376372d);
                            f376373f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
