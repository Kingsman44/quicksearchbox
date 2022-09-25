package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.cu */
/* compiled from: PG */
public final class C66176cu extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66176cu f179951a;

    /* renamed from: c */
    private static volatile C63010eb f179952c;

    /* renamed from: b */
    private byte f179953b = 2;

    static {
        C66176cu cuVar = new C66176cu();
        f179951a = cuVar;
        C62942bv.registerDefaultInstance(C66176cu.class, cuVar);
    }

    private C66176cu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179953b);
            case 1:
                this.f179953b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179951a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66176cu();
            case 4:
                return new C66175ct();
            case 5:
                return f179951a;
            case 6:
                C63010eb ebVar = f179952c;
                if (ebVar == null) {
                    synchronized (C66176cu.class) {
                        ebVar = f179952c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179951a);
                            f179952c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
