package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.nn */
/* compiled from: PG */
public final class C7884nn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7884nn f27661b;

    /* renamed from: c */
    private static volatile C63010eb f27662c;

    /* renamed from: a */
    public C62971cq f27663a = emptyProtobufList();

    static {
        C7884nn nnVar = new C7884nn();
        f27661b = nnVar;
        C62942bv.registerDefaultInstance(C7884nn.class, nnVar);
    }

    private C7884nn() {
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
                return newMessageInfo(f27661b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C7887nq.class});
            case 3:
                return new C7884nn();
            case 4:
                return new C7883nm();
            case 5:
                return f27661b;
            case 6:
                C63010eb ebVar = f27662c;
                if (ebVar == null) {
                    synchronized (C7884nn.class) {
                        ebVar = f27662c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27661b);
                            f27662c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
