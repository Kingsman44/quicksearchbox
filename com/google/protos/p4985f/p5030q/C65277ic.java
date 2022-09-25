package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ic */
/* compiled from: PG */
public final class C65277ic extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65277ic f176587a;

    /* renamed from: b */
    private static volatile C63010eb f176588b;

    static {
        C65277ic icVar = new C65277ic();
        f176587a = icVar;
        C62942bv.registerDefaultInstance(C65277ic.class, icVar);
    }

    private C65277ic() {
        emptyProtobufList();
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
                return newMessageInfo(f176587a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65277ic();
            case 4:
                return new C65276ib();
            case 5:
                return f176587a;
            case 6:
                C63010eb ebVar = f176588b;
                if (ebVar == null) {
                    synchronized (C65277ic.class) {
                        ebVar = f176588b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176587a);
                            f176588b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
