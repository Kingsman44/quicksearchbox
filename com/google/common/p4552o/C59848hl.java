package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.hl */
/* compiled from: PG */
public final class C59848hl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59848hl f161737b;

    /* renamed from: c */
    private static volatile C63010eb f161738c;

    /* renamed from: a */
    public C62971cq f161739a = emptyProtobufList();

    static {
        C59848hl hlVar = new C59848hl();
        f161737b = hlVar;
        C62942bv.registerDefaultInstance(C59848hl.class, hlVar);
    }

    private C59848hl() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f161737b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59846hj.class});
            case 3:
                return new C59848hl();
            case 4:
                return new C59847hk();
            case 5:
                return f161737b;
            case 6:
                C63010eb ebVar = f161738c;
                if (ebVar == null) {
                    synchronized (C59848hl.class) {
                        ebVar = f161738c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161737b);
                            f161738c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
