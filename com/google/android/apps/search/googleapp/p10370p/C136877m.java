package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.m */
/* compiled from: PG */
public final class C136877m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C136877m f372543f;

    /* renamed from: g */
    private static volatile C63010eb f372544g;

    /* renamed from: a */
    public int f372545a;

    /* renamed from: b */
    public C136872h f372546b;

    /* renamed from: c */
    public C136872h f372547c;

    /* renamed from: d */
    public C136872h f372548d;

    /* renamed from: e */
    public C136872h f372549e;

    static {
        C136877m mVar = new C136877m();
        f372543f = mVar;
        C62942bv.registerDefaultInstance(C136877m.class, mVar);
    }

    private C136877m() {
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
                return newMessageInfo(f372543f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C136877m();
            case 4:
                return new C136876l();
            case 5:
                return f372543f;
            case 6:
                C63010eb ebVar = f372544g;
                if (ebVar == null) {
                    synchronized (C136877m.class) {
                        ebVar = f372544g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372543f);
                            f372544g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
