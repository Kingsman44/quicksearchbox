package com.google.p4744p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.p.d */
/* compiled from: PG */
public final class C62874d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62874d f169767c;

    /* renamed from: d */
    private static volatile C63010eb f169768d;

    /* renamed from: a */
    public C62971cq f169769a = emptyProtobufList();

    /* renamed from: b */
    public C63088z f169770b = C63088z.f170246b;

    static {
        C62874d dVar = new C62874d();
        f169767c = dVar;
        C62942bv.registerDefaultInstance(C62874d.class, dVar);
    }

    private C62874d() {
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
                return newMessageInfo(f169767c, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004\n", new Object[]{"a", C62878h.class, "b"});
            case 3:
                return new C62874d();
            case 4:
                return new C62873c();
            case 5:
                return f169767c;
            case 6:
                C63010eb ebVar = f169768d;
                if (ebVar == null) {
                    synchronized (C62874d.class) {
                        ebVar = f169768d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169767c);
                            f169768d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
