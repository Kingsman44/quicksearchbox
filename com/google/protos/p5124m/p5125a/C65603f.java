package com.google.protos.p5124m.p5125a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.m.a.f */
/* compiled from: PG */
public final class C65603f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65603f f178305b;

    /* renamed from: c */
    private static volatile C63010eb f178306c;

    /* renamed from: a */
    public C62971cq f178307a = C62942bv.emptyProtobufList();

    static {
        C65603f fVar = new C65603f();
        f178305b = fVar;
        C62942bv.registerDefaultInstance(C65603f.class, fVar);
    }

    private C65603f() {
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
                return newMessageInfo(f178305b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C65603f();
            case 4:
                return new C65602e();
            case 5:
                return f178305b;
            case 6:
                C63010eb ebVar = f178306c;
                if (ebVar == null) {
                    synchronized (C65603f.class) {
                        ebVar = f178306c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178305b);
                            f178306c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
