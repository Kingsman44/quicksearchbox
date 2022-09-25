package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aei */
/* compiled from: PG */
public final class aei extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final aei f134934a;

    /* renamed from: c */
    private static volatile C63010eb f134935c;

    /* renamed from: b */
    private byte f134936b = 2;

    static {
        aei aei = new aei();
        f134934a = aei;
        C62942bv.registerDefaultInstance(aei.class, aei);
    }

    private aei() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134936b);
            case 1:
                this.f134936b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f134934a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aei();
            case 4:
                return new aeh();
            case 5:
                return f134934a;
            case 6:
                C63010eb ebVar = f134935c;
                if (ebVar == null) {
                    synchronized (aei.class) {
                        ebVar = f134935c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134934a);
                            f134935c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
