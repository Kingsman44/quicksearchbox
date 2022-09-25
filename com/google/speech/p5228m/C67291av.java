package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.av */
/* compiled from: PG */
public final class C67291av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67291av f182911c;

    /* renamed from: d */
    private static volatile C63010eb f182912d;

    /* renamed from: a */
    public int f182913a;

    /* renamed from: b */
    public int f182914b;

    static {
        C67291av avVar = new C67291av();
        f182911c = avVar;
        C62942bv.registerDefaultInstance(C67291av.class, avVar);
    }

    private C67291av() {
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
                return newMessageInfo(f182911c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67291av();
            case 4:
                return new C67290au();
            case 5:
                return f182911c;
            case 6:
                C63010eb ebVar = f182912d;
                if (ebVar == null) {
                    synchronized (C67291av.class) {
                        ebVar = f182912d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182911c);
                            f182912d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
