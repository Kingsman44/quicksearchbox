package com.google.research.p5181a.p5182a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.a.f */
/* compiled from: PG */
public final class C66283f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66283f f180257d;

    /* renamed from: e */
    private static volatile C63010eb f180258e;

    /* renamed from: a */
    public int f180259a;

    /* renamed from: b */
    public C66288k f180260b;

    /* renamed from: c */
    public int f180261c;

    static {
        C66283f fVar = new C66283f();
        f180257d = fVar;
        C62942bv.registerDefaultInstance(C66283f.class, fVar);
    }

    private C66283f() {
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
                return newMessageInfo(f180257d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66283f();
            case 4:
                return new C66282e();
            case 5:
                return f180257d;
            case 6:
                C63010eb ebVar = f180258e;
                if (ebVar == null) {
                    synchronized (C66283f.class) {
                        ebVar = f180258e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180257d);
                            f180258e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
