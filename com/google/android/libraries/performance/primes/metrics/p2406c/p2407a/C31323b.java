package com.google.android.libraries.performance.primes.metrics.p2406c.p2407a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.c.a.b */
/* compiled from: PG */
public final class C31323b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C31323b f84340a;

    /* renamed from: b */
    private static volatile C63010eb f84341b;

    static {
        C31323b bVar = new C31323b();
        f84340a = bVar;
        C62942bv.registerDefaultInstance(C31323b.class, bVar);
    }

    private C31323b() {
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
                return newMessageInfo(f84340a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C31323b();
            case 4:
                return new C31322a();
            case 5:
                return f84340a;
            case 6:
                C63010eb ebVar = f84341b;
                if (ebVar == null) {
                    synchronized (C31323b.class) {
                        ebVar = f84341b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f84340a);
                            f84341b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
