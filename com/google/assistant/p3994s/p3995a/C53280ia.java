package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ia */
/* compiled from: PG */
public final class C53280ia extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53280ia f139686c;

    /* renamed from: d */
    private static volatile C63010eb f139687d;

    /* renamed from: a */
    public C62971cq f139688a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f139689b = emptyProtobufList();

    static {
        C53280ia iaVar = new C53280ia();
        f139686c = iaVar;
        C62942bv.registerDefaultInstance(C53280ia.class, iaVar);
    }

    private C53280ia() {
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
                return newMessageInfo(f139686c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C53198f.class, "b", C53278hz.class});
            case 3:
                return new C53280ia();
            case 4:
                return new C53276hx();
            case 5:
                return f139686c;
            case 6:
                C63010eb ebVar = f139687d;
                if (ebVar == null) {
                    synchronized (C53280ia.class) {
                        ebVar = f139687d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139686c);
                            f139687d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
