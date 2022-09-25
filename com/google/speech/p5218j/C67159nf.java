package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.nf */
/* compiled from: PG */
public final class C67159nf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67159nf f182553c;

    /* renamed from: d */
    private static volatile C63010eb f182554d;

    /* renamed from: a */
    public C62971cq f182555a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f182556b = emptyProtobufList();

    static {
        C67159nf nfVar = new C67159nf();
        f182553c = nfVar;
        C62942bv.registerDefaultInstance(C67159nf.class, nfVar);
    }

    private C67159nf() {
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
                return newMessageInfo(f182553c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", C67157nd.class, "b", C67180y.class});
            case 3:
                return new C67159nf();
            case 4:
                return new C67158ne();
            case 5:
                return f182553c;
            case 6:
                C63010eb ebVar = f182554d;
                if (ebVar == null) {
                    synchronized (C67159nf.class) {
                        ebVar = f182554d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182553c);
                            f182554d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
