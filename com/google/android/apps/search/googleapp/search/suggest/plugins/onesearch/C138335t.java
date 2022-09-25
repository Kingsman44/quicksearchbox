package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.t */
/* compiled from: PG */
public final class C138335t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138335t f376365d;

    /* renamed from: e */
    private static volatile C63010eb f376366e;

    /* renamed from: a */
    public int f376367a;

    /* renamed from: b */
    public C138246cb f376368b;

    /* renamed from: c */
    public long f376369c;

    static {
        C138335t tVar = new C138335t();
        f376365d = tVar;
        C62942bv.registerDefaultInstance(C138335t.class, tVar);
    }

    private C138335t() {
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
                return newMessageInfo(f376365d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138335t();
            case 4:
                return new C138318s();
            case 5:
                return f376365d;
            case 6:
                C63010eb ebVar = f376366e;
                if (ebVar == null) {
                    synchronized (C138335t.class) {
                        ebVar = f376366e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376365d);
                            f376366e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
