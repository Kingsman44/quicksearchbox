package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4764a.p4765a.p4766a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.a.a.a.a.h */
/* compiled from: PG */
public final class C63121h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63121h f170396b;

    /* renamed from: c */
    private static volatile C63010eb f170397c;

    /* renamed from: a */
    public C62971cq f170398a = emptyProtobufList();

    static {
        C63121h hVar = new C63121h();
        f170396b = hVar;
        C62942bv.registerDefaultInstance(C63121h.class, hVar);
    }

    private C63121h() {
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
                return newMessageInfo(f170396b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63120g.class});
            case 3:
                return new C63121h();
            case 4:
                return new C63118e();
            case 5:
                return f170396b;
            case 6:
                C63010eb ebVar = f170397c;
                if (ebVar == null) {
                    synchronized (C63121h.class) {
                        ebVar = f170397c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170396b);
                            f170397c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
