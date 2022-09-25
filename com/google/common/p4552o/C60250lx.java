package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.lx */
/* compiled from: PG */
public final class C60250lx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60250lx f163020b;

    /* renamed from: c */
    private static volatile C63010eb f163021c;

    /* renamed from: a */
    public C62971cq f163022a = emptyProtobufList();

    static {
        C60250lx lxVar = new C60250lx();
        f163020b = lxVar;
        C62942bv.registerDefaultInstance(C60250lx.class, lxVar);
    }

    private C60250lx() {
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
                return newMessageInfo(f163020b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C60247lu.class});
            case 3:
                return new C60250lx();
            case 4:
                return new C60242lp();
            case 5:
                return f163020b;
            case 6:
                C63010eb ebVar = f163021c;
                if (ebVar == null) {
                    synchronized (C60250lx.class) {
                        ebVar = f163021c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163020b);
                            f163021c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
