package com.google.assistant.p3980n.p3981a.p3982a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.a.a.f */
/* compiled from: PG */
public final class C53003f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53003f f138936b;

    /* renamed from: c */
    private static volatile C63010eb f138937c;

    /* renamed from: a */
    public C62971cq f138938a = emptyProtobufList();

    static {
        C53003f fVar = new C53003f();
        f138936b = fVar;
        C62942bv.registerDefaultInstance(C53003f.class, fVar);
    }

    private C53003f() {
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
                return newMessageInfo(f138936b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52999b.class});
            case 3:
                return new C53003f();
            case 4:
                return new C53002e();
            case 5:
                return f138936b;
            case 6:
                C63010eb ebVar = f138937c;
                if (ebVar == null) {
                    synchronized (C53003f.class) {
                        ebVar = f138937c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138936b);
                            f138937c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
