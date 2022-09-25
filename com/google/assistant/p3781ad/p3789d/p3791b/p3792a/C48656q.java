package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.q */
/* compiled from: PG */
public final class C48656q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48656q f125749c;

    /* renamed from: d */
    private static volatile C63010eb f125750d;

    /* renamed from: a */
    public C48654o f125751a;

    /* renamed from: b */
    public C62971cq f125752b = emptyProtobufList();

    static {
        C48656q qVar = new C48656q();
        f125749c = qVar;
        C62942bv.registerDefaultInstance(C48656q.class, qVar);
    }

    private C48656q() {
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
                return newMessageInfo(f125749c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", C48654o.class});
            case 3:
                return new C48656q();
            case 4:
                return new C48655p();
            case 5:
                return f125749c;
            case 6:
                C63010eb ebVar = f125750d;
                if (ebVar == null) {
                    synchronized (C48656q.class) {
                        ebVar = f125750d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125749c);
                            f125750d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
