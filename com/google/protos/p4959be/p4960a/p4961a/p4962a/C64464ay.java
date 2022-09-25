package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ay */
/* compiled from: PG */
public final class C64464ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64464ay f174856a;

    /* renamed from: b */
    private static volatile C63010eb f174857b;

    static {
        C64464ay ayVar = new C64464ay();
        f174856a = ayVar;
        C62942bv.registerDefaultInstance(C64464ay.class, ayVar);
    }

    private C64464ay() {
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
                return newMessageInfo(f174856a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C64464ay();
            case 4:
                return new C64463ax();
            case 5:
                return f174856a;
            case 6:
                C63010eb ebVar = f174857b;
                if (ebVar == null) {
                    synchronized (C64464ay.class) {
                        ebVar = f174857b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174856a);
                            f174857b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
