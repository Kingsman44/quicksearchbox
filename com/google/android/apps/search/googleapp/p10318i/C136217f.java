package com.google.android.apps.search.googleapp.p10318i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.i.f */
/* compiled from: PG */
public final class C136217f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C136217f f370970f;

    /* renamed from: g */
    private static volatile C63010eb f370971g;

    /* renamed from: a */
    public int f370972a;

    /* renamed from: b */
    public int f370973b = 8;

    /* renamed from: c */
    public int f370974c;

    /* renamed from: d */
    public int f370975d;

    /* renamed from: e */
    public int f370976e;

    static {
        C136217f fVar = new C136217f();
        f370970f = fVar;
        C62942bv.registerDefaultInstance(C136217f.class, fVar);
    }

    private C136217f() {
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
                return newMessageInfo(f370970f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C136216e.m221350b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C136217f();
            case 4:
                return new C136214c();
            case 5:
                return f370970f;
            case 6:
                C63010eb ebVar = f370971g;
                if (ebVar == null) {
                    synchronized (C136217f.class) {
                        ebVar = f370971g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370970f);
                            f370971g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
