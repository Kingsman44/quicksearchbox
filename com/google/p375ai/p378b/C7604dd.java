package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.dd */
/* compiled from: PG */
public final class C7604dd extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C7604dd f26266a;

    /* renamed from: c */
    private static volatile C63010eb f26267c;

    /* renamed from: b */
    private byte f26268b = 2;

    static {
        C7604dd ddVar = new C7604dd();
        f26266a = ddVar;
        C62942bv.registerDefaultInstance(C7604dd.class, ddVar);
    }

    private C7604dd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26268b);
            case 1:
                this.f26268b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f26266a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7604dd();
            case 4:
                return new C7603dc();
            case 5:
                return f26266a;
            case 6:
                C63010eb ebVar = f26267c;
                if (ebVar == null) {
                    synchronized (C7604dd.class) {
                        ebVar = f26267c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26266a);
                            f26267c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
