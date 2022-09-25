package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.dg */
/* compiled from: PG */
public final class C57306dg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57306dg f152963b;

    /* renamed from: c */
    private static volatile C63010eb f152964c;

    /* renamed from: a */
    public C62971cq f152965a = emptyProtobufList();

    static {
        C57306dg dgVar = new C57306dg();
        f152963b = dgVar;
        C62942bv.registerDefaultInstance(C57306dg.class, dgVar);
    }

    private C57306dg() {
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
                return newMessageInfo(f152963b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62910ar.class});
            case 3:
                return new C57306dg();
            case 4:
                return new C57305df();
            case 5:
                return f152963b;
            case 6:
                C63010eb ebVar = f152964c;
                if (ebVar == null) {
                    synchronized (C57306dg.class) {
                        ebVar = f152964c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152963b);
                            f152964c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
