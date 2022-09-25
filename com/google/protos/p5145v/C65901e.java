package com.google.protos.p5145v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.e */
/* compiled from: PG */
public final class C65901e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65901e f179224b;

    /* renamed from: c */
    private static volatile C63010eb f179225c;

    /* renamed from: a */
    public C62971cq f179226a = emptyProtobufList();

    static {
        C65901e eVar = new C65901e();
        f179224b = eVar;
        C62942bv.registerDefaultInstance(C65901e.class, eVar);
    }

    private C65901e() {
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
                return newMessageInfo(f179224b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65898b.class});
            case 3:
                return new C65901e();
            case 4:
                return new C65900d();
            case 5:
                return f179224b;
            case 6:
                C63010eb ebVar = f179225c;
                if (ebVar == null) {
                    synchronized (C65901e.class) {
                        ebVar = f179225c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179224b);
                            f179225c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
