package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.q */
/* compiled from: PG */
public final class C65559q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65559q f178162b;

    /* renamed from: c */
    private static volatile C63010eb f178163c;

    /* renamed from: a */
    public C62971cq f178164a = emptyProtobufList();

    static {
        C65559q qVar = new C65559q();
        f178162b = qVar;
        C62942bv.registerDefaultInstance(C65559q.class, qVar);
    }

    private C65559q() {
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
                return newMessageInfo(f178162b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65558p.class});
            case 3:
                return new C65559q();
            case 4:
                return new C65552j();
            case 5:
                return f178162b;
            case 6:
                C63010eb ebVar = f178163c;
                if (ebVar == null) {
                    synchronized (C65559q.class) {
                        ebVar = f178163c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178162b);
                            f178163c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
