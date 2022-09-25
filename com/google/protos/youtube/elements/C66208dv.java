package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.dv */
/* compiled from: PG */
public final class C66208dv extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66208dv f180040a;

    /* renamed from: c */
    private static volatile C63010eb f180041c;

    /* renamed from: b */
    private byte f180042b = 2;

    static {
        C66208dv dvVar = new C66208dv();
        f180040a = dvVar;
        C62942bv.registerDefaultInstance(C66208dv.class, dvVar);
    }

    private C66208dv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180042b);
            case 1:
                this.f180042b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f180040a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66208dv();
            case 4:
                return new C66207du();
            case 5:
                return f180040a;
            case 6:
                C63010eb ebVar = f180041c;
                if (ebVar == null) {
                    synchronized (C66208dv.class) {
                        ebVar = f180041c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180040a);
                            f180041c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
