package com.google.p5269w.p5270a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.w.a.c */
/* compiled from: PG */
public final class C67961c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67961c f184168d;

    /* renamed from: e */
    private static volatile C63010eb f184169e;

    /* renamed from: a */
    public int f184170a;

    /* renamed from: b */
    public long f184171b;

    /* renamed from: c */
    public long f184172c;

    static {
        C67961c cVar = new C67961c();
        f184168d = cVar;
        C62942bv.registerDefaultInstance(C67961c.class, cVar);
    }

    private C67961c() {
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
                return newMessageInfo(f184168d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67961c();
            case 4:
                return new C67960b();
            case 5:
                return f184168d;
            case 6:
                C63010eb ebVar = f184169e;
                if (ebVar == null) {
                    synchronized (C67961c.class) {
                        ebVar = f184169e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184168d);
                            f184169e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
