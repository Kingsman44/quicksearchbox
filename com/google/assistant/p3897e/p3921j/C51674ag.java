package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ag */
/* compiled from: PG */
public final class C51674ag extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C51674ag f135026a;

    /* renamed from: c */
    private static volatile C63010eb f135027c;

    /* renamed from: b */
    private byte f135028b = 2;

    static {
        C51674ag agVar = new C51674ag();
        f135026a = agVar;
        C62942bv.registerDefaultInstance(C51674ag.class, agVar);
    }

    private C51674ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135028b);
            case 1:
                this.f135028b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f135026a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51674ag();
            case 4:
                return new C51673af();
            case 5:
                return f135026a;
            case 6:
                C63010eb ebVar = f135027c;
                if (ebVar == null) {
                    synchronized (C51674ag.class) {
                        ebVar = f135027c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135026a);
                            f135027c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
