package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gc */
/* compiled from: PG */
public final class C66967gc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66967gc f182031c;

    /* renamed from: d */
    private static volatile C63010eb f182032d;

    /* renamed from: a */
    public int f182033a;

    /* renamed from: b */
    public C66977gm f182034b;

    static {
        C66967gc gcVar = new C66967gc();
        f182031c = gcVar;
        C62942bv.registerDefaultInstance(C66967gc.class, gcVar);
    }

    private C66967gc() {
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
                return newMessageInfo(f182031c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66967gc();
            case 4:
                return new C66966gb();
            case 5:
                return f182031c;
            case 6:
                C63010eb ebVar = f182032d;
                if (ebVar == null) {
                    synchronized (C66967gc.class) {
                        ebVar = f182032d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182031c);
                            f182032d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
