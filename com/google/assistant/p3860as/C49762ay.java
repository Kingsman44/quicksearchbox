package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.ay */
/* compiled from: PG */
public final class C49762ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49762ay f128501a;

    /* renamed from: b */
    private static volatile C63010eb f128502b;

    static {
        C49762ay ayVar = new C49762ay();
        f128501a = ayVar;
        C62942bv.registerDefaultInstance(C49762ay.class, ayVar);
    }

    private C49762ay() {
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
                return newMessageInfo(f128501a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49762ay();
            case 4:
                return new C49761ax();
            case 5:
                return f128501a;
            case 6:
                C63010eb ebVar = f128502b;
                if (ebVar == null) {
                    synchronized (C49762ay.class) {
                        ebVar = f128502b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128501a);
                            f128502b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
