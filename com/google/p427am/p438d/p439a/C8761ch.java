package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.ch */
/* compiled from: PG */
public final class C8761ch extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8761ch f30117a;

    /* renamed from: b */
    private static volatile C63010eb f30118b;

    static {
        C8761ch chVar = new C8761ch();
        f30117a = chVar;
        C62942bv.registerDefaultInstance(C8761ch.class, chVar);
    }

    private C8761ch() {
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
                return newMessageInfo(f30117a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8761ch();
            case 4:
                return new C8760cg();
            case 5:
                return f30117a;
            case 6:
                C63010eb ebVar = f30118b;
                if (ebVar == null) {
                    synchronized (C8761ch.class) {
                        ebVar = f30118b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30117a);
                            f30118b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
