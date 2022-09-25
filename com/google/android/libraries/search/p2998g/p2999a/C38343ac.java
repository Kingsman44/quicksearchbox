package com.google.android.libraries.search.p2998g.p2999a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.ac */
/* compiled from: PG */
public final class C38343ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C38343ac f101528b;

    /* renamed from: c */
    private static volatile C63010eb f101529c;

    /* renamed from: a */
    public C62971cq f101530a = emptyProtobufList();

    static {
        C38343ac acVar = new C38343ac();
        f101528b = acVar;
        C62942bv.registerDefaultInstance(C38343ac.class, acVar);
    }

    private C38343ac() {
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
                return newMessageInfo(f101528b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C38342ab.class});
            case 3:
                return new C38343ac();
            case 4:
                return new C38385z();
            case 5:
                return f101528b;
            case 6:
                C63010eb ebVar = f101529c;
                if (ebVar == null) {
                    synchronized (C38343ac.class) {
                        ebVar = f101529c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101528b);
                            f101529c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
