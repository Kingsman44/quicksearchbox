package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.cb */
/* compiled from: PG */
public final class C59505cb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59505cb f157884b;

    /* renamed from: c */
    private static volatile C63010eb f157885c;

    /* renamed from: a */
    public C62971cq f157886a = emptyProtobufList();

    static {
        C59505cb cbVar = new C59505cb();
        f157884b = cbVar;
        C62942bv.registerDefaultInstance(C59505cb.class, cbVar);
    }

    private C59505cb() {
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
                return newMessageInfo(f157884b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59504ca.class});
            case 3:
                return new C59505cb();
            case 4:
                return new C59501by();
            case 5:
                return f157884b;
            case 6:
                C63010eb ebVar = f157885c;
                if (ebVar == null) {
                    synchronized (C59505cb.class) {
                        ebVar = f157885c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157884b);
                            f157885c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
