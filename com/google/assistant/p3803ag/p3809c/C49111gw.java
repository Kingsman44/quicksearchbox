package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.gw */
/* compiled from: PG */
public final class C49111gw extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C49111gw f127019a;

    /* renamed from: c */
    private static volatile C63010eb f127020c;

    /* renamed from: b */
    private byte f127021b = 2;

    static {
        C49111gw gwVar = new C49111gw();
        f127019a = gwVar;
        C62942bv.registerDefaultInstance(C49111gw.class, gwVar);
    }

    private C49111gw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127021b);
            case 1:
                this.f127021b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f127019a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49111gw();
            case 4:
                return new C49110gv();
            case 5:
                return f127019a;
            case 6:
                C63010eb ebVar = f127020c;
                if (ebVar == null) {
                    synchronized (C49111gw.class) {
                        ebVar = f127020c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127019a);
                            f127020c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
