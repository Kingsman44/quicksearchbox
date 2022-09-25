package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.x */
/* compiled from: PG */
public final class C65077x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65077x f176224b;

    /* renamed from: c */
    private static volatile C63010eb f176225c;

    /* renamed from: a */
    public C62971cq f176226a = emptyProtobufList();

    static {
        C65077x xVar = new C65077x();
        f176224b = xVar;
        C62942bv.registerDefaultInstance(C65077x.class, xVar);
    }

    private C65077x() {
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
                return newMessageInfo(f176224b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65076w.class});
            case 3:
                return new C65077x();
            case 4:
                return new C65072s();
            case 5:
                return f176224b;
            case 6:
                C63010eb ebVar = f176225c;
                if (ebVar == null) {
                    synchronized (C65077x.class) {
                        ebVar = f176225c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176224b);
                            f176225c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
