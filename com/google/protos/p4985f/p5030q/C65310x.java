package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.x */
/* compiled from: PG */
public final class C65310x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65310x f176638c;

    /* renamed from: d */
    private static volatile C63010eb f176639d;

    /* renamed from: a */
    public int f176640a;

    /* renamed from: b */
    public C65202fi f176641b;

    static {
        C65310x xVar = new C65310x();
        f176638c = xVar;
        C62942bv.registerDefaultInstance(C65310x.class, xVar);
    }

    private C65310x() {
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
                return newMessageInfo(f176638c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65310x();
            case 4:
                return new C65309w();
            case 5:
                return f176638c;
            case 6:
                C63010eb ebVar = f176639d;
                if (ebVar == null) {
                    synchronized (C65310x.class) {
                        ebVar = f176639d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176638c);
                            f176639d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
