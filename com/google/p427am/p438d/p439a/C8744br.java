package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.br */
/* compiled from: PG */
public final class C8744br extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8744br f30084a;

    /* renamed from: b */
    private static volatile C63010eb f30085b;

    static {
        C8744br brVar = new C8744br();
        f30084a = brVar;
        C62942bv.registerDefaultInstance(C8744br.class, brVar);
    }

    private C8744br() {
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
                return newMessageInfo(f30084a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8744br();
            case 4:
                return new C8743bq();
            case 5:
                return f30084a;
            case 6:
                C63010eb ebVar = f30085b;
                if (ebVar == null) {
                    synchronized (C8744br.class) {
                        ebVar = f30085b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30084a);
                            f30085b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
