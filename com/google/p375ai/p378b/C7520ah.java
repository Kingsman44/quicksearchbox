package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.ah */
/* compiled from: PG */
public final class C7520ah extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C7520ah f26038a;

    /* renamed from: c */
    private static volatile C63010eb f26039c;

    /* renamed from: b */
    private byte f26040b = 2;

    static {
        C7520ah ahVar = new C7520ah();
        f26038a = ahVar;
        C62942bv.registerDefaultInstance(C7520ah.class, ahVar);
    }

    private C7520ah() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26040b);
            case 1:
                this.f26040b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f26038a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7520ah();
            case 4:
                return new C7519ag();
            case 5:
                return f26038a;
            case 6:
                C63010eb ebVar = f26039c;
                if (ebVar == null) {
                    synchronized (C7520ah.class) {
                        ebVar = f26039c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26038a);
                            f26039c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
