package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.bo */
/* compiled from: PG */
public final class C33802bo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33802bo f90254a;

    /* renamed from: b */
    private static volatile C63010eb f90255b;

    static {
        C33802bo boVar = new C33802bo();
        f90254a = boVar;
        C62942bv.registerDefaultInstance(C33802bo.class, boVar);
    }

    private C33802bo() {
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
                return newMessageInfo(f90254a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33802bo();
            case 4:
                return new C33801bn();
            case 5:
                return f90254a;
            case 6:
                C63010eb ebVar = f90255b;
                if (ebVar == null) {
                    synchronized (C33802bo.class) {
                        ebVar = f90255b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90254a);
                            f90255b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
