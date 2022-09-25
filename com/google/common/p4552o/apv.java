package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.apv */
/* compiled from: PG */
public final class apv extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final apv f159704a;

    /* renamed from: c */
    private static volatile C63010eb f159705c;

    /* renamed from: b */
    private byte f159706b = 2;

    static {
        apv apv = new apv();
        f159704a = apv;
        C62942bv.registerDefaultInstance(apv.class, apv);
    }

    private apv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159706b);
            case 1:
                this.f159706b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f159704a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new apv();
            case 4:
                return new apu();
            case 5:
                return f159704a;
            case 6:
                C63010eb ebVar = f159705c;
                if (ebVar == null) {
                    synchronized (apv.class) {
                        ebVar = f159705c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159704a);
                            f159705c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
