package com.google.p4129b.p4136c.p4138b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.b.d */
/* compiled from: PG */
public final class C54752d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54752d f143665a;

    /* renamed from: c */
    private static volatile C63010eb f143666c;

    /* renamed from: b */
    private C54754f f143667b;

    static {
        C54752d dVar = new C54752d();
        f143665a = dVar;
        C62942bv.registerDefaultInstance(C54752d.class, dVar);
    }

    private C54752d() {
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
                return newMessageInfo(f143665a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"b"});
            case 3:
                return new C54752d();
            case 4:
                return new C54751c();
            case 5:
                return f143665a;
            case 6:
                C63010eb ebVar = f143666c;
                if (ebVar == null) {
                    synchronized (C54752d.class) {
                        ebVar = f143666c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143665a);
                            f143666c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
