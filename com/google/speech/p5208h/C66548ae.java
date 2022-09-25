package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.h.ae */
/* compiled from: PG */
public final class C66548ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66548ae f180987d;

    /* renamed from: e */
    private static volatile C63010eb f180988e;

    /* renamed from: a */
    public int f180989a;

    /* renamed from: b */
    public C63088z f180990b = C63088z.f170246b;

    /* renamed from: c */
    public int f180991c;

    static {
        C66548ae aeVar = new C66548ae();
        f180987d = aeVar;
        C62942bv.registerDefaultInstance(C66548ae.class, aeVar);
    }

    private C66548ae() {
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
                return newMessageInfo(f180987d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ည\u0000", new Object[]{"a", C45240c.f118157a, C66547ad.f180986a, "b"});
            case 3:
                return new C66548ae();
            case 4:
                return new C66546ac();
            case 5:
                return f180987d;
            case 6:
                C63010eb ebVar = f180988e;
                if (ebVar == null) {
                    synchronized (C66548ae.class) {
                        ebVar = f180988e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180987d);
                            f180988e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
