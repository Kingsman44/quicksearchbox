package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.bv */
/* compiled from: PG */
public final class C66143bv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66143bv f179857f;

    /* renamed from: g */
    private static volatile C63010eb f179858g;

    /* renamed from: a */
    public int f179859a;

    /* renamed from: b */
    public C66145bx f179860b;

    /* renamed from: c */
    public C66145bx f179861c;

    /* renamed from: d */
    public C66145bx f179862d;

    /* renamed from: e */
    public C66145bx f179863e;

    static {
        C66143bv bvVar = new C66143bv();
        f179857f = bvVar;
        C62942bv.registerDefaultInstance(C66143bv.class, bvVar);
    }

    private C66143bv() {
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
                return newMessageInfo(f179857f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66143bv();
            case 4:
                return new C66142bu();
            case 5:
                return f179857f;
            case 6:
                C63010eb ebVar = f179858g;
                if (ebVar == null) {
                    synchronized (C66143bv.class) {
                        ebVar = f179858g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179857f);
                            f179858g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
