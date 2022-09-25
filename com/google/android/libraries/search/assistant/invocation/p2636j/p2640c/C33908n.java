package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.n */
/* compiled from: PG */
public final class C33908n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33908n f90454c;

    /* renamed from: d */
    private static volatile C63010eb f90455d;

    /* renamed from: a */
    public int f90456a = 0;

    /* renamed from: b */
    public Object f90457b;

    static {
        C33908n nVar = new C33908n();
        f90454c = nVar;
        C62942bv.registerDefaultInstance(C33908n.class, nVar);
    }

    private C33908n() {
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
                return newMessageInfo(f90454c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C33904j.class, C33902h.class});
            case 3:
                return new C33908n();
            case 4:
                return new C33907m();
            case 5:
                return f90454c;
            case 6:
                C63010eb ebVar = f90455d;
                if (ebVar == null) {
                    synchronized (C33908n.class) {
                        ebVar = f90455d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90454c);
                            f90455d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
