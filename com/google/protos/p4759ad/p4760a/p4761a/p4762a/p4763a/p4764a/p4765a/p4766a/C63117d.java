package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4764a.p4765a.p4766a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.a.a.a.a.d */
/* compiled from: PG */
public final class C63117d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63117d f170388b;

    /* renamed from: c */
    private static volatile C63010eb f170389c;

    /* renamed from: a */
    public C62971cq f170390a = emptyProtobufList();

    static {
        C63117d dVar = new C63117d();
        f170388b = dVar;
        C62942bv.registerDefaultInstance(C63117d.class, dVar);
    }

    private C63117d() {
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
                return newMessageInfo(f170388b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63116c.class});
            case 3:
                return new C63117d();
            case 4:
                return new C63114a();
            case 5:
                return f170388b;
            case 6:
                C63010eb ebVar = f170389c;
                if (ebVar == null) {
                    synchronized (C63117d.class) {
                        ebVar = f170389c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170388b);
                            f170389c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
