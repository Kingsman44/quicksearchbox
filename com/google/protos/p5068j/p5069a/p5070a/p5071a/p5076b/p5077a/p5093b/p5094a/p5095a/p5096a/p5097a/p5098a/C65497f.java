package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.f */
/* compiled from: PG */
public final class C65497f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65497f f178057b;

    /* renamed from: c */
    private static volatile C63010eb f178058c;

    /* renamed from: a */
    public C62971cq f178059a = emptyProtobufList();

    static {
        C65497f fVar = new C65497f();
        f178057b = fVar;
        C62942bv.registerDefaultInstance(C65497f.class, fVar);
    }

    private C65497f() {
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
                return newMessageInfo(f178057b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65496e.class});
            case 3:
                return new C65497f();
            case 4:
                return new C65492a();
            case 5:
                return f178057b;
            case 6:
                C63010eb ebVar = f178058c;
                if (ebVar == null) {
                    synchronized (C65497f.class) {
                        ebVar = f178058c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178057b);
                            f178058c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
