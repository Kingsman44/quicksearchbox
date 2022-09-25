package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.nf */
/* compiled from: PG */
public final class C7876nf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7876nf f27615b;

    /* renamed from: c */
    private static volatile C63010eb f27616c;

    /* renamed from: a */
    public C62971cq f27617a = emptyProtobufList();

    static {
        C7876nf nfVar = new C7876nf();
        f27615b = nfVar;
        C62942bv.registerDefaultInstance(C7876nf.class, nfVar);
    }

    private C7876nf() {
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
                return newMessageInfo(f27615b, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0000\u0006\u001b", new Object[]{"a", C7889ns.class});
            case 3:
                return new C7876nf();
            case 4:
                return new C7875ne();
            case 5:
                return f27615b;
            case 6:
                C63010eb ebVar = f27616c;
                if (ebVar == null) {
                    synchronized (C7876nf.class) {
                        ebVar = f27616c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27615b);
                            f27616c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
