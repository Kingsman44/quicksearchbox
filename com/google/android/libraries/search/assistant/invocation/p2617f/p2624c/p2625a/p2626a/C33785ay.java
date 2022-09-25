package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ay */
/* compiled from: PG */
public final class C33785ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33785ay f90235a;

    /* renamed from: b */
    private static volatile C63010eb f90236b;

    static {
        C33785ay ayVar = new C33785ay();
        f90235a = ayVar;
        C62942bv.registerDefaultInstance(C33785ay.class, ayVar);
    }

    private C33785ay() {
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
                return newMessageInfo(f90235a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33785ay();
            case 4:
                return new C33784ax();
            case 5:
                return f90235a;
            case 6:
                C63010eb ebVar = f90236b;
                if (ebVar == null) {
                    synchronized (C33785ay.class) {
                        ebVar = f90236b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90235a);
                            f90236b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
