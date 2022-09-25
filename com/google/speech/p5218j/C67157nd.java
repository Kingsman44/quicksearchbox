package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.nd */
/* compiled from: PG */
public final class C67157nd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67157nd f182549c;

    /* renamed from: d */
    private static volatile C63010eb f182550d;

    /* renamed from: a */
    public int f182551a;

    /* renamed from: b */
    public int f182552b;

    static {
        C67157nd ndVar = new C67157nd();
        f182549c = ndVar;
        C62942bv.registerDefaultInstance(C67157nd.class, ndVar);
    }

    private C67157nd() {
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
                return newMessageInfo(f182549c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C67156nc.f182548a});
            case 3:
                return new C67157nd();
            case 4:
                return new C67155nb();
            case 5:
                return f182549c;
            case 6:
                C63010eb ebVar = f182550d;
                if (ebVar == null) {
                    synchronized (C67157nd.class) {
                        ebVar = f182550d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182549c);
                            f182550d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
