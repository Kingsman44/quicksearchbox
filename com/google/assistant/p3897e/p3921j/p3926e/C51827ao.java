package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ao */
/* compiled from: PG */
public final class C51827ao extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C51827ao f135971a;

    /* renamed from: c */
    private static volatile C63010eb f135972c;

    /* renamed from: b */
    private byte f135973b = 2;

    static {
        C51827ao aoVar = new C51827ao();
        f135971a = aoVar;
        C62942bv.registerDefaultInstance(C51827ao.class, aoVar);
    }

    private C51827ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135973b);
            case 1:
                this.f135973b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f135971a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51827ao();
            case 4:
                return new C51826an();
            case 5:
                return f135971a;
            case 6:
                C63010eb ebVar = f135972c;
                if (ebVar == null) {
                    synchronized (C51827ao.class) {
                        ebVar = f135972c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135971a);
                            f135972c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
