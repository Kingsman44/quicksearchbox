package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.ay */
/* compiled from: PG */
public final class C53767ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53767ay f141136a;

    /* renamed from: b */
    private static volatile C63010eb f141137b;

    static {
        C53767ay ayVar = new C53767ay();
        f141136a = ayVar;
        C62942bv.registerDefaultInstance(C53767ay.class, ayVar);
    }

    private C53767ay() {
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
                return newMessageInfo(f141136a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53767ay();
            case 4:
                return new C53766ax();
            case 5:
                return f141136a;
            case 6:
                C63010eb ebVar = f141137b;
                if (ebVar == null) {
                    synchronized (C53767ay.class) {
                        ebVar = f141137b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141136a);
                            f141137b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
