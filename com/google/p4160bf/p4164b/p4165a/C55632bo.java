package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bo */
/* compiled from: PG */
public final class C55632bo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55632bo f146792a;

    /* renamed from: b */
    private static volatile C63010eb f146793b;

    static {
        C55632bo boVar = new C55632bo();
        f146792a = boVar;
        C62942bv.registerDefaultInstance(C55632bo.class, boVar);
    }

    private C55632bo() {
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
                return newMessageInfo(f146792a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55632bo();
            case 4:
                return new C55631bn();
            case 5:
                return f146792a;
            case 6:
                C63010eb ebVar = f146793b;
                if (ebVar == null) {
                    synchronized (C55632bo.class) {
                        ebVar = f146793b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146792a);
                            f146793b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
