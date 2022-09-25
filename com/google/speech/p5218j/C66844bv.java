package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.bv */
/* compiled from: PG */
public final class C66844bv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66844bv f181759d;

    /* renamed from: e */
    private static volatile C63010eb f181760e;

    /* renamed from: a */
    public int f181761a;

    /* renamed from: b */
    public C66946fi f181762b;

    /* renamed from: c */
    public int f181763c;

    static {
        C66844bv bvVar = new C66844bv();
        f181759d = bvVar;
        C62942bv.registerDefaultInstance(C66844bv.class, bvVar);
    }

    private C66844bv() {
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
                return newMessageInfo(f181759d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0002\u0003ဉ\u0001", new Object[]{"a", C45240c.f118157a, C66942fe.m97388b(), "b"});
            case 3:
                return new C66844bv();
            case 4:
                return new C66843bu();
            case 5:
                return f181759d;
            case 6:
                C63010eb ebVar = f181760e;
                if (ebVar == null) {
                    synchronized (C66844bv.class) {
                        ebVar = f181760e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181759d);
                            f181760e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
