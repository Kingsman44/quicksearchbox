package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ej */
/* compiled from: PG */
public final class C65176ej extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65176ej f176380b;

    /* renamed from: c */
    private static volatile C63010eb f176381c;

    /* renamed from: a */
    public C62971cq f176382a = emptyProtobufList();

    static {
        C65176ej ejVar = new C65176ej();
        f176380b = ejVar;
        C62942bv.registerDefaultInstance(C65176ej.class, ejVar);
    }

    private C65176ej() {
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
                return newMessageInfo(f176380b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65174eh.class});
            case 3:
                return new C65176ej();
            case 4:
                return new C65175ei();
            case 5:
                return f176380b;
            case 6:
                C63010eb ebVar = f176381c;
                if (ebVar == null) {
                    synchronized (C65176ej.class) {
                        ebVar = f176381c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176380b);
                            f176381c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
