package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.ac */
/* compiled from: PG */
public final class C63662ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63662ac f172144a;

    /* renamed from: b */
    private static volatile C63010eb f172145b;

    static {
        C63662ac acVar = new C63662ac();
        f172144a = acVar;
        C62942bv.registerDefaultInstance(C63662ac.class, acVar);
    }

    private C63662ac() {
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
                return newMessageInfo(f172144a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63662ac();
            case 4:
                return new C63661ab();
            case 5:
                return f172144a;
            case 6:
                C63010eb ebVar = f172145b;
                if (ebVar == null) {
                    synchronized (C63662ac.class) {
                        ebVar = f172145b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172144a);
                            f172145b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
