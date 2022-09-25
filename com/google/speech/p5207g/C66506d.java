package com.google.speech.p5207g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.g.d */
/* compiled from: PG */
public final class C66506d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66506d f180874b;

    /* renamed from: c */
    private static volatile C63010eb f180875c;

    /* renamed from: a */
    public C62971cq f180876a = emptyProtobufList();

    static {
        C66506d dVar = new C66506d();
        f180874b = dVar;
        C62942bv.registerDefaultInstance(C66506d.class, dVar);
    }

    private C66506d() {
        emptyIntList();
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
                return newMessageInfo(f180874b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66508f.class});
            case 3:
                return new C66506d();
            case 4:
                return new C66505c();
            case 5:
                return f180874b;
            case 6:
                C63010eb ebVar = f180875c;
                if (ebVar == null) {
                    synchronized (C66506d.class) {
                        ebVar = f180875c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180874b);
                            f180875c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
