package com.google.research.p5181a.p5182a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.a.d */
/* compiled from: PG */
public final class C66281d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66281d f180252d;

    /* renamed from: e */
    private static volatile C63010eb f180253e;

    /* renamed from: a */
    public int f180254a;

    /* renamed from: b */
    public int f180255b;

    /* renamed from: c */
    public long f180256c;

    static {
        C66281d dVar = new C66281d();
        f180252d = dVar;
        C62942bv.registerDefaultInstance(C66281d.class, dVar);
    }

    private C66281d() {
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
                return newMessageInfo(f180252d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66281d();
            case 4:
                return new C66280c();
            case 5:
                return f180252d;
            case 6:
                C63010eb ebVar = f180253e;
                if (ebVar == null) {
                    synchronized (C66281d.class) {
                        ebVar = f180253e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180252d);
                            f180253e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
