package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5204e.C66494e;

/* renamed from: com.google.speech.h.ab */
/* compiled from: PG */
public final class C66545ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66545ab f180982c;

    /* renamed from: d */
    private static volatile C63010eb f180983d;

    /* renamed from: a */
    public int f180984a;

    /* renamed from: b */
    public int f180985b;

    static {
        C66545ab abVar = new C66545ab();
        f180982c = abVar;
        C62942bv.registerDefaultInstance(C66545ab.class, abVar);
    }

    private C66545ab() {
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
                return newMessageInfo(f180982c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66494e.f180805a});
            case 3:
                return new C66545ab();
            case 4:
                return new C66544aa();
            case 5:
                return f180982c;
            case 6:
                C63010eb ebVar = f180983d;
                if (ebVar == null) {
                    synchronized (C66545ab.class) {
                        ebVar = f180983d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180982c);
                            f180983d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
