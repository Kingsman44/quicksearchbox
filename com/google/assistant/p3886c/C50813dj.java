package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.dj */
/* compiled from: PG */
public final class C50813dj extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C50813dj f132278a;

    /* renamed from: c */
    private static volatile C63010eb f132279c;

    /* renamed from: b */
    private byte f132280b = 2;

    static {
        C50813dj djVar = new C50813dj();
        f132278a = djVar;
        C62942bv.registerDefaultInstance(C50813dj.class, djVar);
    }

    private C50813dj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132280b);
            case 1:
                this.f132280b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f132278a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50813dj();
            case 4:
                return new C50812di();
            case 5:
                return f132278a;
            case 6:
                C63010eb ebVar = f132279c;
                if (ebVar == null) {
                    synchronized (C50813dj.class) {
                        ebVar = f132279c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132278a);
                            f132279c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
