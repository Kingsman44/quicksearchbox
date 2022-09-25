package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lt */
/* compiled from: PG */
public final class C67119lt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67119lt f182458b;

    /* renamed from: c */
    private static volatile C63010eb f182459c;

    /* renamed from: a */
    public C62971cq f182460a = emptyProtobufList();

    static {
        C67119lt ltVar = new C67119lt();
        f182458b = ltVar;
        C62942bv.registerDefaultInstance(C67119lt.class, ltVar);
    }

    private C67119lt() {
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
                return newMessageInfo(f182458b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C67123lx.class});
            case 3:
                return new C67119lt();
            case 4:
                return new C67118ls();
            case 5:
                return f182458b;
            case 6:
                C63010eb ebVar = f182459c;
                if (ebVar == null) {
                    synchronized (C67119lt.class) {
                        ebVar = f182459c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182458b);
                            f182459c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
