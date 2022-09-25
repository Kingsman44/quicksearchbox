package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv */
/* compiled from: PG */
public final class C138214bv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C138214bv f376051f;

    /* renamed from: g */
    private static volatile C63010eb f376052g;

    /* renamed from: a */
    public int f376053a;

    /* renamed from: b */
    public long f376054b;

    /* renamed from: c */
    public long f376055c;

    /* renamed from: d */
    public long f376056d;

    /* renamed from: e */
    public long f376057e;

    static {
        C138214bv bvVar = new C138214bv();
        f376051f = bvVar;
        C62942bv.registerDefaultInstance(C138214bv.class, bvVar);
    }

    private C138214bv() {
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
                return newMessageInfo(f376051f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C138214bv();
            case 4:
                return new C138213bu();
            case 5:
                return f376051f;
            case 6:
                C63010eb ebVar = f376052g;
                if (ebVar == null) {
                    synchronized (C138214bv.class) {
                        ebVar = f376052g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376051f);
                            f376052g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
