package com.google.p4283bv.p4412k.p4414b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.b.d */
/* compiled from: PG */
public final class C57840d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57840d f154539b;

    /* renamed from: c */
    private static volatile C63010eb f154540c;

    /* renamed from: a */
    public C62971cq f154541a = emptyProtobufList();

    static {
        C57840d dVar = new C57840d();
        f154539b = dVar;
        C62942bv.registerDefaultInstance(C57840d.class, dVar);
    }

    private C57840d() {
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
                return newMessageInfo(f154539b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57838b.class});
            case 3:
                return new C57840d();
            case 4:
                return new C57839c();
            case 5:
                return f154539b;
            case 6:
                C63010eb ebVar = f154540c;
                if (ebVar == null) {
                    synchronized (C57840d.class) {
                        ebVar = f154540c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154539b);
                            f154540c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
