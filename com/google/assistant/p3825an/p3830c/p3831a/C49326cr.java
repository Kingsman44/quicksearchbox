package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.cr */
/* compiled from: PG */
public final class C49326cr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49326cr f127482a;

    /* renamed from: b */
    private static volatile C63010eb f127483b;

    static {
        C49326cr crVar = new C49326cr();
        f127482a = crVar;
        C62942bv.registerDefaultInstance(C49326cr.class, crVar);
    }

    private C49326cr() {
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
                return newMessageInfo(f127482a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49326cr();
            case 4:
                return new C49325cq();
            case 5:
                return f127482a;
            case 6:
                C63010eb ebVar = f127483b;
                if (ebVar == null) {
                    synchronized (C49326cr.class) {
                        ebVar = f127483b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127482a);
                            f127483b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
