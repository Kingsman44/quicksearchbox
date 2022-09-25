package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.bs */
/* compiled from: PG */
public final class C48630bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48630bs f125672b;

    /* renamed from: c */
    private static volatile C63010eb f125673c;

    /* renamed from: a */
    public C62971cq f125674a = emptyProtobufList();

    static {
        C48630bs bsVar = new C48630bs();
        f125672b = bsVar;
        C62942bv.registerDefaultInstance(C48630bs.class, bsVar);
    }

    private C48630bs() {
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
                return newMessageInfo(f125672b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48629br.class});
            case 3:
                return new C48630bs();
            case 4:
                return new C48627bp();
            case 5:
                return f125672b;
            case 6:
                C63010eb ebVar = f125673c;
                if (ebVar == null) {
                    synchronized (C48630bs.class) {
                        ebVar = f125673c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125672b);
                            f125673c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
