package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.bc */
/* compiled from: PG */
public final class C33790bc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33790bc f90241a;

    /* renamed from: b */
    private static volatile C63010eb f90242b;

    static {
        C33790bc bcVar = new C33790bc();
        f90241a = bcVar;
        C62942bv.registerDefaultInstance(C33790bc.class, bcVar);
    }

    private C33790bc() {
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
                return newMessageInfo(f90241a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33790bc();
            case 4:
                return new C33789bb();
            case 5:
                return f90241a;
            case 6:
                C63010eb ebVar = f90242b;
                if (ebVar == null) {
                    synchronized (C33790bc.class) {
                        ebVar = f90242b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90241a);
                            f90242b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
