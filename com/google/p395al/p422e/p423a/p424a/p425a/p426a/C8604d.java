package com.google.p395al.p422e.p423a.p424a.p425a.p426a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.e.a.a.a.a.d */
/* compiled from: PG */
public final class C8604d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8604d f29830d;

    /* renamed from: e */
    private static volatile C63010eb f29831e;

    /* renamed from: a */
    public int f29832a;

    /* renamed from: b */
    public boolean f29833b;

    /* renamed from: c */
    public boolean f29834c;

    static {
        C8604d dVar = new C8604d();
        f29830d = dVar;
        C62942bv.registerDefaultInstance(C8604d.class, dVar);
    }

    private C8604d() {
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
                return newMessageInfo(f29830d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8604d();
            case 4:
                return new C8603c();
            case 5:
                return f29830d;
            case 6:
                C63010eb ebVar = f29831e;
                if (ebVar == null) {
                    synchronized (C8604d.class) {
                        ebVar = f29831e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29830d);
                            f29831e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
