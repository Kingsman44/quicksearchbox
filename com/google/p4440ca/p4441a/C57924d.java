package com.google.p4440ca.p4441a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ca.a.d */
/* compiled from: PG */
public final class C57924d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57924d f154931b;

    /* renamed from: c */
    private static volatile C63010eb f154932c;

    /* renamed from: a */
    public C62971cq f154933a = emptyProtobufList();

    static {
        C57924d dVar = new C57924d();
        f154931b = dVar;
        C62942bv.registerDefaultInstance(C57924d.class, dVar);
    }

    private C57924d() {
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
                return newMessageInfo(f154931b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57922b.class});
            case 3:
                return new C57924d();
            case 4:
                return new C57923c();
            case 5:
                return f154931b;
            case 6:
                C63010eb ebVar = f154932c;
                if (ebVar == null) {
                    synchronized (C57924d.class) {
                        ebVar = f154932c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154931b);
                            f154932c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
