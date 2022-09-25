package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5005g.C64855b;

/* renamed from: com.google.protos.p.b.j */
/* compiled from: PG */
public final class C65841j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65841j f178984b;

    /* renamed from: c */
    private static volatile C63010eb f178985c;

    /* renamed from: a */
    public C62971cq f178986a = emptyProtobufList();

    static {
        C65841j jVar = new C65841j();
        f178984b = jVar;
        C62942bv.registerDefaultInstance(C65841j.class, jVar);
    }

    private C65841j() {
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
                return newMessageInfo(f178984b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64855b.class});
            case 3:
                return new C65841j();
            case 4:
                return new C65840i();
            case 5:
                return f178984b;
            case 6:
                C63010eb ebVar = f178985c;
                if (ebVar == null) {
                    synchronized (C65841j.class) {
                        ebVar = f178985c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178984b);
                            f178985c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
