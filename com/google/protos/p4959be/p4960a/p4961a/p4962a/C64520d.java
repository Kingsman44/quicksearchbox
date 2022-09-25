package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.d */
/* compiled from: PG */
public final class C64520d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64520d f174983b;

    /* renamed from: c */
    private static volatile C63010eb f174984c;

    /* renamed from: a */
    public C62971cq f174985a = emptyProtobufList();

    static {
        C64520d dVar = new C64520d();
        f174983b = dVar;
        C62942bv.registerDefaultInstance(C64520d.class, dVar);
    }

    private C64520d() {
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
                return newMessageInfo(f174983b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64466b.class});
            case 3:
                return new C64520d();
            case 4:
                return new C64493c();
            case 5:
                return f174983b;
            case 6:
                C63010eb ebVar = f174984c;
                if (ebVar == null) {
                    synchronized (C64520d.class) {
                        ebVar = f174984c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174983b);
                            f174984c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
