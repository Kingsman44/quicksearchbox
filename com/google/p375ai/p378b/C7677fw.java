package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.fw */
/* compiled from: PG */
public final class C7677fw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7677fw f26653b;

    /* renamed from: c */
    private static volatile C63010eb f26654c;

    /* renamed from: a */
    public C62971cq f26655a = emptyProtobufList();

    static {
        C7677fw fwVar = new C7677fw();
        f26653b = fwVar;
        C62942bv.registerDefaultInstance(C7677fw.class, fwVar);
    }

    private C7677fw() {
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
                return newMessageInfo(f26653b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C7676fv.class});
            case 3:
                return new C7677fw();
            case 4:
                return new C7674ft();
            case 5:
                return f26653b;
            case 6:
                C63010eb ebVar = f26654c;
                if (ebVar == null) {
                    synchronized (C7677fw.class) {
                        ebVar = f26654c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26653b);
                            f26654c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
