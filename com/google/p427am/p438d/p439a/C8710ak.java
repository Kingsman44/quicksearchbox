package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.ak */
/* compiled from: PG */
public final class C8710ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8710ak f30040b;

    /* renamed from: c */
    private static volatile C63010eb f30041c;

    /* renamed from: a */
    public C62971cq f30042a = emptyProtobufList();

    static {
        C8710ak akVar = new C8710ak();
        f30040b = akVar;
        C62942bv.registerDefaultInstance(C8710ak.class, akVar);
    }

    private C8710ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f30040b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8751by.class});
            case 3:
                return new C8710ak();
            case 4:
                return new C8709aj();
            case 5:
                return f30040b;
            case 6:
                C63010eb ebVar = f30041c;
                if (ebVar == null) {
                    synchronized (C8710ak.class) {
                        ebVar = f30041c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30040b);
                            f30041c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
