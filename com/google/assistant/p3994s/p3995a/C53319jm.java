package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jm */
/* compiled from: PG */
public final class C53319jm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53319jm f139814d;

    /* renamed from: e */
    private static volatile C63010eb f139815e;

    /* renamed from: a */
    public int f139816a;

    /* renamed from: b */
    public C53301iv f139817b;

    /* renamed from: c */
    public int f139818c;

    static {
        C53319jm jmVar = new C53319jm();
        f139814d = jmVar;
        C62942bv.registerDefaultInstance(C53319jm.class, jmVar);
    }

    private C53319jm() {
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
                return newMessageInfo(f139814d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C53317jk.f139813a});
            case 3:
                return new C53319jm();
            case 4:
                return new C53318jl();
            case 5:
                return f139814d;
            case 6:
                C63010eb ebVar = f139815e;
                if (ebVar == null) {
                    synchronized (C53319jm.class) {
                        ebVar = f139815e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139814d);
                            f139815e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
