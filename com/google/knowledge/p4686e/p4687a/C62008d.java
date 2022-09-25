package com.google.knowledge.p4686e.p4687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.e.a.d */
/* compiled from: PG */
public final class C62008d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62008d f167559b;

    /* renamed from: c */
    private static volatile C63010eb f167560c;

    /* renamed from: a */
    public C62971cq f167561a = emptyProtobufList();

    static {
        C62008d dVar = new C62008d();
        f167559b = dVar;
        C62942bv.registerDefaultInstance(C62008d.class, dVar);
    }

    private C62008d() {
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
                return newMessageInfo(f167559b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62006b.class});
            case 3:
                return new C62008d();
            case 4:
                return new C62007c();
            case 5:
                return f167559b;
            case 6:
                C63010eb ebVar = f167560c;
                if (ebVar == null) {
                    synchronized (C62008d.class) {
                        ebVar = f167560c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167559b);
                            f167560c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
