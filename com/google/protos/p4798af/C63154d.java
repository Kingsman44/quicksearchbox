package com.google.protos.p4798af;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.af.d */
/* compiled from: PG */
public final class C63154d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63154d f170534b;

    /* renamed from: c */
    private static volatile C63010eb f170535c;

    /* renamed from: a */
    public C62971cq f170536a = emptyProtobufList();

    static {
        C63154d dVar = new C63154d();
        f170534b = dVar;
        C62942bv.registerDefaultInstance(C63154d.class, dVar);
    }

    private C63154d() {
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
                return newMessageInfo(f170534b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63153c.class});
            case 3:
                return new C63154d();
            case 4:
                return new C63151a();
            case 5:
                return f170534b;
            case 6:
                C63010eb ebVar = f170535c;
                if (ebVar == null) {
                    synchronized (C63154d.class) {
                        ebVar = f170535c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170534b);
                            f170535c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
