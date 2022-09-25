package com.google.p363ad.p364a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.f */
/* compiled from: PG */
public final class C6682f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C6682f f19956c;

    /* renamed from: d */
    private static volatile C63010eb f19957d;

    /* renamed from: a */
    public int f19958a = 0;

    /* renamed from: b */
    public Object f19959b;

    static {
        C6682f fVar = new C6682f();
        f19956c = fVar;
        C62942bv.registerDefaultInstance(C6682f.class, fVar);
    }

    private C6682f() {
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
                return newMessageInfo(f19956c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C6681e.class, C6679c.class});
            case 3:
                return new C6682f();
            case 4:
                return new C6668a();
            case 5:
                return f19956c;
            case 6:
                C63010eb ebVar = f19957d;
                if (ebVar == null) {
                    synchronized (C6682f.class) {
                        ebVar = f19957d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19956c);
                            f19957d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
