package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ap */
/* compiled from: PG */
public final class C34026ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34026ap f90680a;

    /* renamed from: b */
    private static volatile C63010eb f90681b;

    static {
        C34026ap apVar = new C34026ap();
        f90680a = apVar;
        C62942bv.registerDefaultInstance(C34026ap.class, apVar);
    }

    private C34026ap() {
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
                return newMessageInfo(f90680a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34026ap();
            case 4:
                return new C34025ao();
            case 5:
                return f90680a;
            case 6:
                C63010eb ebVar = f90681b;
                if (ebVar == null) {
                    synchronized (C34026ap.class) {
                        ebVar = f90681b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90680a);
                            f90681b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
