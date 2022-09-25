package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.k */
/* compiled from: PG */
public final class C31363k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C31363k f84455c;

    /* renamed from: e */
    private static volatile C63010eb f84456e;

    /* renamed from: a */
    public int f84457a;

    /* renamed from: b */
    public int f84458b;

    /* renamed from: d */
    private int f84459d;

    static {
        C31363k kVar = new C31363k();
        f84455c = kVar;
        C62942bv.registerDefaultInstance(C31363k.class, kVar);
    }

    private C31363k() {
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
                return newMessageInfo(f84455c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C31363k();
            case 4:
                return new C31362j();
            case 5:
                return f84455c;
            case 6:
                C63010eb ebVar = f84456e;
                if (ebVar == null) {
                    synchronized (C31363k.class) {
                        ebVar = f84456e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f84455c);
                            f84456e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
