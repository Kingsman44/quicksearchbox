package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.oe */
/* compiled from: PG */
public final class C53446oe extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53446oe f140277b;

    /* renamed from: c */
    private static volatile C63010eb f140278c;

    /* renamed from: a */
    public C62971cq f140279a = emptyProtobufList();

    static {
        C53446oe oeVar = new C53446oe();
        f140277b = oeVar;
        C62942bv.registerDefaultInstance(C53446oe.class, oeVar);
    }

    private C53446oe() {
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
                return newMessageInfo(f140277b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53445od.class});
            case 3:
                return new C53446oe();
            case 4:
                return new C53443ob();
            case 5:
                return f140277b;
            case 6:
                C63010eb ebVar = f140278c;
                if (ebVar == null) {
                    synchronized (C53446oe.class) {
                        ebVar = f140278c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140277b);
                            f140278c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
