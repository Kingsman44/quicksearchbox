package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pu */
/* compiled from: PG */
public final class C14615pu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14615pu f44180b;

    /* renamed from: c */
    private static volatile C63010eb f44181c;

    /* renamed from: a */
    public C62971cq f44182a = emptyProtobufList();

    static {
        C14615pu puVar = new C14615pu();
        f44180b = puVar;
        C62942bv.registerDefaultInstance(C14615pu.class, puVar);
    }

    private C14615pu() {
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
                return newMessageInfo(f44180b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C14348fx.class});
            case 3:
                return new C14615pu();
            case 4:
                return new C14614pt();
            case 5:
                return f44180b;
            case 6:
                C63010eb ebVar = f44181c;
                if (ebVar == null) {
                    synchronized (C14615pu.class) {
                        ebVar = f44181c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44180b);
                            f44181c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
