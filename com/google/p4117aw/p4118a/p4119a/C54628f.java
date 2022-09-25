package com.google.p4117aw.p4118a.p4119a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.f */
/* compiled from: PG */
public final class C54628f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54628f f143433d;

    /* renamed from: e */
    private static volatile C63010eb f143434e;

    /* renamed from: a */
    public int f143435a;

    /* renamed from: b */
    public C62971cq f143436b = emptyProtobufList();

    /* renamed from: c */
    public double f143437c;

    static {
        C54628f fVar = new C54628f();
        f143433d = fVar;
        C62942bv.registerDefaultInstance(C54628f.class, fVar);
    }

    private C54628f() {
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
                return newMessageInfo(f143433d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002က\u0000", new Object[]{"a", "b", C54626d.class, C45240c.f118157a});
            case 3:
                return new C54628f();
            case 4:
                return new C54627e();
            case 5:
                return f143433d;
            case 6:
                C63010eb ebVar = f143434e;
                if (ebVar == null) {
                    synchronized (C54628f.class) {
                        ebVar = f143434e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143433d);
                            f143434e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
