package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.bg */
/* compiled from: PG */
public final class C66128bg extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66128bg f179829a;

    /* renamed from: c */
    private static volatile C63010eb f179830c;

    /* renamed from: b */
    private byte f179831b = 2;

    static {
        C66128bg bgVar = new C66128bg();
        f179829a = bgVar;
        C62942bv.registerDefaultInstance(C66128bg.class, bgVar);
    }

    private C66128bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179831b);
            case 1:
                this.f179831b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179829a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66128bg();
            case 4:
                return new C66127bf();
            case 5:
                return f179829a;
            case 6:
                C63010eb ebVar = f179830c;
                if (ebVar == null) {
                    synchronized (C66128bg.class) {
                        ebVar = f179830c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179829a);
                            f179830c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
