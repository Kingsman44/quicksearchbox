package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.av */
/* compiled from: PG */
public final class C11691av extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11691av f37700b;

    /* renamed from: c */
    private static volatile C63010eb f37701c;

    /* renamed from: a */
    public C62971cq f37702a = emptyProtobufList();

    static {
        C11691av avVar = new C11691av();
        f37700b = avVar;
        C62942bv.registerDefaultInstance(C11691av.class, avVar);
    }

    private C11691av() {
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
                return newMessageInfo(f37700b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C11687ar.class});
            case 3:
                return new C11691av();
            case 4:
                return new C11690au();
            case 5:
                return f37700b;
            case 6:
                C63010eb ebVar = f37701c;
                if (ebVar == null) {
                    synchronized (C11691av.class) {
                        ebVar = f37701c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37700b);
                            f37701c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
