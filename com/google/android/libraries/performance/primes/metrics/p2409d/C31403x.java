package com.google.android.libraries.performance.primes.metrics.p2409d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.x */
/* compiled from: PG */
public final class C31403x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C31403x f84557c;

    /* renamed from: e */
    private static volatile C63010eb f84558e;

    /* renamed from: a */
    public int f84559a;

    /* renamed from: b */
    public String f84560b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f84561d;

    static {
        C31403x xVar = new C31403x();
        f84557c = xVar;
        C62942bv.registerDefaultInstance(C31403x.class, xVar);
    }

    private C31403x() {
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
                return newMessageInfo(f84557c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C31404y.f84562a, "b"});
            case 3:
                return new C31403x();
            case 4:
                return new C31402w();
            case 5:
                return f84557c;
            case 6:
                C63010eb ebVar = f84558e;
                if (ebVar == null) {
                    synchronized (C31403x.class) {
                        ebVar = f84558e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f84557c);
                            f84558e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
