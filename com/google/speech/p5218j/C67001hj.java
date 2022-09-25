package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.hj */
/* compiled from: PG */
public final class C67001hj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67001hj f182145c;

    /* renamed from: d */
    private static volatile C63010eb f182146d;

    /* renamed from: a */
    public int f182147a;

    /* renamed from: b */
    public int f182148b;

    static {
        C67001hj hjVar = new C67001hj();
        f182145c = hjVar;
        C62942bv.registerDefaultInstance(C67001hj.class, hjVar);
    }

    private C67001hj() {
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
                return newMessageInfo(f182145c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67001hj();
            case 4:
                return new C67000hi();
            case 5:
                return f182145c;
            case 6:
                C63010eb ebVar = f182146d;
                if (ebVar == null) {
                    synchronized (C67001hj.class) {
                        ebVar = f182146d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182145c);
                            f182146d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
