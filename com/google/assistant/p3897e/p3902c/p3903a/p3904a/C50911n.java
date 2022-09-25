package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.n */
/* compiled from: PG */
public final class C50911n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50911n f132548e;

    /* renamed from: f */
    private static volatile C63010eb f132549f;

    /* renamed from: a */
    public int f132550a;

    /* renamed from: b */
    public C62971cq f132551b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f132552c = emptyProtobufList();

    /* renamed from: d */
    public C50909l f132553d;

    static {
        C50911n nVar = new C50911n();
        f132548e = nVar;
        C62942bv.registerDefaultInstance(C50911n.class, nVar);
    }

    private C50911n() {
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
                return newMessageInfo(f132548e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", C50911n.class, C45240c.f118157a, C50911n.class, "d"});
            case 3:
                return new C50911n();
            case 4:
                return new C50910m();
            case 5:
                return f132548e;
            case 6:
                C63010eb ebVar = f132549f;
                if (ebVar == null) {
                    synchronized (C50911n.class) {
                        ebVar = f132549f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132548e);
                            f132549f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
