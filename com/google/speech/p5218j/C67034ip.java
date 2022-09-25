package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ip */
/* compiled from: PG */
public final class C67034ip extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67034ip f182208d;

    /* renamed from: e */
    private static volatile C63010eb f182209e;

    /* renamed from: a */
    public int f182210a;

    /* renamed from: b */
    public int f182211b;

    /* renamed from: c */
    public boolean f182212c;

    static {
        C67034ip ipVar = new C67034ip();
        f182208d = ipVar;
        C62942bv.registerDefaultInstance(C67034ip.class, ipVar);
    }

    private C67034ip() {
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
                return newMessageInfo(f182208d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C67033io.m97412b(), C45240c.f118157a});
            case 3:
                return new C67034ip();
            case 4:
                return new C67031im();
            case 5:
                return f182208d;
            case 6:
                C63010eb ebVar = f182209e;
                if (ebVar == null) {
                    synchronized (C67034ip.class) {
                        ebVar = f182209e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182208d);
                            f182209e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
