package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.ci */
/* compiled from: PG */
public final class C59927ci extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59927ci f161969c;

    /* renamed from: d */
    private static volatile C63010eb f161970d;

    /* renamed from: a */
    public int f161971a;

    /* renamed from: b */
    public int f161972b;

    static {
        C59927ci ciVar = new C59927ci();
        f161969c = ciVar;
        C62942bv.registerDefaultInstance(C59927ci.class, ciVar);
    }

    private C59927ci() {
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
                return newMessageInfo(f161969c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59927ci();
            case 4:
                return new C59926ch();
            case 5:
                return f161969c;
            case 6:
                C63010eb ebVar = f161970d;
                if (ebVar == null) {
                    synchronized (C59927ci.class) {
                        ebVar = f161970d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161969c);
                            f161970d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
