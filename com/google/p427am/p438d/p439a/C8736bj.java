package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.bj */
/* compiled from: PG */
public final class C8736bj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8736bj f30076b;

    /* renamed from: c */
    private static volatile C63010eb f30077c;

    /* renamed from: a */
    public boolean f30078a;

    static {
        C8736bj bjVar = new C8736bj();
        f30076b = bjVar;
        C62942bv.registerDefaultInstance(C8736bj.class, bjVar);
    }

    private C8736bj() {
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
                return newMessageInfo(f30076b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C8736bj();
            case 4:
                return new C8735bi();
            case 5:
                return f30076b;
            case 6:
                C63010eb ebVar = f30077c;
                if (ebVar == null) {
                    synchronized (C8736bj.class) {
                        ebVar = f30077c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30076b);
                            f30077c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
