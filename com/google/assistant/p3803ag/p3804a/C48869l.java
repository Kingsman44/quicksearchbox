package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.l */
/* compiled from: PG */
public final class C48869l extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C48869l f126467a;

    /* renamed from: c */
    private static volatile C63010eb f126468c;

    /* renamed from: b */
    private byte f126469b = 2;

    static {
        C48869l lVar = new C48869l();
        f126467a = lVar;
        C62942bv.registerDefaultInstance(C48869l.class, lVar);
    }

    private C48869l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126469b);
            case 1:
                this.f126469b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f126467a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48869l();
            case 4:
                return new C48868k();
            case 5:
                return f126467a;
            case 6:
                C63010eb ebVar = f126468c;
                if (ebVar == null) {
                    synchronized (C48869l.class) {
                        ebVar = f126468c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126467a);
                            f126468c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
