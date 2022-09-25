package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.jm */
/* compiled from: PG */
public final class C52215jm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52215jm f137024b;

    /* renamed from: c */
    private static volatile C63010eb f137025c;

    /* renamed from: a */
    public C62971cq f137026a = C62942bv.emptyProtobufList();

    static {
        C52215jm jmVar = new C52215jm();
        f137024b = jmVar;
        C62942bv.registerDefaultInstance(C52215jm.class, jmVar);
    }

    private C52215jm() {
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
                return newMessageInfo(f137024b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C52215jm();
            case 4:
                return new C52214jl();
            case 5:
                return f137024b;
            case 6:
                C63010eb ebVar = f137025c;
                if (ebVar == null) {
                    synchronized (C52215jm.class) {
                        ebVar = f137025c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137024b);
                            f137025c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
