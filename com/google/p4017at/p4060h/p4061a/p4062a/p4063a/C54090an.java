package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.an */
/* compiled from: PG */
public final class C54090an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54090an f141925a;

    /* renamed from: b */
    private static volatile C63010eb f141926b;

    static {
        C54090an anVar = new C54090an();
        f141925a = anVar;
        C62942bv.registerDefaultInstance(C54090an.class, anVar);
    }

    private C54090an() {
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
                return newMessageInfo(f141925a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54090an();
            case 4:
                return new C54089am();
            case 5:
                return f141925a;
            case 6:
                C63010eb ebVar = f141926b;
                if (ebVar == null) {
                    synchronized (C54090an.class) {
                        ebVar = f141926b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141925a);
                            f141926b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
