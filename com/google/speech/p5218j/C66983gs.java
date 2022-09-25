package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gs */
/* compiled from: PG */
public final class C66983gs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66983gs f182072b;

    /* renamed from: c */
    private static volatile C63010eb f182073c;

    /* renamed from: a */
    public C62971cq f182074a = C62942bv.emptyProtobufList();

    static {
        C66983gs gsVar = new C66983gs();
        f182072b = gsVar;
        C62942bv.registerDefaultInstance(C66983gs.class, gsVar);
    }

    private C66983gs() {
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
                return newMessageInfo(f182072b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C66983gs();
            case 4:
                return new C66982gr();
            case 5:
                return f182072b;
            case 6:
                C63010eb ebVar = f182073c;
                if (ebVar == null) {
                    synchronized (C66983gs.class) {
                        ebVar = f182073c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182072b);
                            f182073c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
