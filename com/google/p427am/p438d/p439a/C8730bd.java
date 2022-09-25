package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.bd */
/* compiled from: PG */
public final class C8730bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8730bd f30068b;

    /* renamed from: c */
    private static volatile C63010eb f30069c;

    /* renamed from: a */
    public boolean f30070a;

    static {
        C8730bd bdVar = new C8730bd();
        f30068b = bdVar;
        C62942bv.registerDefaultInstance(C8730bd.class, bdVar);
    }

    private C8730bd() {
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
                return newMessageInfo(f30068b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C8730bd();
            case 4:
                return new C8729bc();
            case 5:
                return f30068b;
            case 6:
                C63010eb ebVar = f30069c;
                if (ebVar == null) {
                    synchronized (C8730bd.class) {
                        ebVar = f30069c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30068b);
                            f30069c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
