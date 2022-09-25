package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.p.a.y */
/* compiled from: PG */
public final class C65740y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f178591c = new C65738w();

    /* renamed from: d */
    public static final C65740y f178592d;

    /* renamed from: f */
    private static volatile C63010eb f178593f;

    /* renamed from: a */
    public C65716ao f178594a;

    /* renamed from: b */
    public C62961ch f178595b = emptyIntList();

    /* renamed from: e */
    private int f178596e;

    static {
        C65740y yVar = new C65740y();
        f178592d = yVar;
        C62942bv.registerDefaultInstance(C65740y.class, yVar);
    }

    private C65740y() {
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
                return newMessageInfo(f178592d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"e", "a", "b", C65753ak.m96798c()});
            case 3:
                return new C65740y();
            case 4:
                return new C65739x();
            case 5:
                return f178592d;
            case 6:
                C63010eb ebVar = f178593f;
                if (ebVar == null) {
                    synchronized (C65740y.class) {
                        ebVar = f178593f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178592d);
                            f178593f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
