package com.google.p4653i.p4654a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.bd */
/* compiled from: PG */
public final class C61690bd extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61690bd f166668a;

    /* renamed from: c */
    private static volatile C63010eb f166669c;

    /* renamed from: b */
    private byte f166670b = 2;

    static {
        C61690bd bdVar = new C61690bd();
        f166668a = bdVar;
        C62942bv.registerDefaultInstance(C61690bd.class, bdVar);
    }

    private C61690bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166670b);
            case 1:
                this.f166670b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f166668a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61690bd();
            case 4:
                return new C61689bc();
            case 5:
                return f166668a;
            case 6:
                C63010eb ebVar = f166669c;
                if (ebVar == null) {
                    synchronized (C61690bd.class) {
                        ebVar = f166669c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166668a);
                            f166669c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
