package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.ay */
/* compiled from: PG */
public final class C66063ay extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66063ay f179656a;

    /* renamed from: c */
    private static volatile C63010eb f179657c;

    /* renamed from: b */
    private byte f179658b = 2;

    static {
        C66063ay ayVar = new C66063ay();
        f179656a = ayVar;
        C62942bv.registerDefaultInstance(C66063ay.class, ayVar);
    }

    private C66063ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179658b);
            case 1:
                this.f179658b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179656a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66063ay();
            case 4:
                return new C66062ax();
            case 5:
                return f179656a;
            case 6:
                C63010eb ebVar = f179657c;
                if (ebVar == null) {
                    synchronized (C66063ay.class) {
                        ebVar = f179657c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179656a);
                            f179657c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
