package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ib */
/* compiled from: PG */
public final class C52030ib extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C52030ib f136561a;

    /* renamed from: c */
    private static volatile C63010eb f136562c;

    /* renamed from: b */
    private byte f136563b = 2;

    static {
        C52030ib ibVar = new C52030ib();
        f136561a = ibVar;
        C62942bv.registerDefaultInstance(C52030ib.class, ibVar);
    }

    private C52030ib() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136563b);
            case 1:
                this.f136563b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f136561a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52030ib();
            case 4:
                return new C52029ia();
            case 5:
                return f136561a;
            case 6:
                C63010eb ebVar = f136562c;
                if (ebVar == null) {
                    synchronized (C52030ib.class) {
                        ebVar = f136562c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136561a);
                            f136562c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
