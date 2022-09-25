package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.da */
/* compiled from: PG */
public final class C62478da extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62478da f168682b;

    /* renamed from: c */
    private static volatile C63010eb f168683c;

    /* renamed from: a */
    public C62971cq f168684a = emptyProtobufList();

    static {
        C62478da daVar = new C62478da();
        f168682b = daVar;
        C62942bv.registerDefaultInstance(C62478da.class, daVar);
    }

    private C62478da() {
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
                return newMessageInfo(f168682b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62500dw.class});
            case 3:
                return new C62478da();
            case 4:
                return new C62476cz();
            case 5:
                return f168682b;
            case 6:
                C63010eb ebVar = f168683c;
                if (ebVar == null) {
                    synchronized (C62478da.class) {
                        ebVar = f168683c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168682b);
                            f168683c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
