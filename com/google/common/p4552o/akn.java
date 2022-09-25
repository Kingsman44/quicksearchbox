package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.akn */
/* compiled from: PG */
public final class akn extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final akn f158974a;

    /* renamed from: c */
    private static volatile C63010eb f158975c;

    /* renamed from: b */
    private byte f158976b = 2;

    static {
        akn akn = new akn();
        f158974a = akn;
        C62942bv.registerDefaultInstance(akn.class, akn);
    }

    private akn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158976b);
            case 1:
                this.f158976b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f158974a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new akn();
            case 4:
                return new akm();
            case 5:
                return f158974a;
            case 6:
                C63010eb ebVar = f158975c;
                if (ebVar == null) {
                    synchronized (akn.class) {
                        ebVar = f158975c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158974a);
                            f158975c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
