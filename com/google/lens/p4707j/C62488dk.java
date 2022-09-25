package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.dk */
/* compiled from: PG */
public final class C62488dk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62488dk f168699d;

    /* renamed from: e */
    private static volatile C63010eb f168700e;

    /* renamed from: a */
    public int f168701a;

    /* renamed from: b */
    public float f168702b;

    /* renamed from: c */
    public float f168703c;

    static {
        C62488dk dkVar = new C62488dk();
        f168699d = dkVar;
        C62942bv.registerDefaultInstance(C62488dk.class, dkVar);
    }

    private C62488dk() {
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
                return newMessageInfo(f168699d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62488dk();
            case 4:
                return new C62487dj();
            case 5:
                return f168699d;
            case 6:
                C63010eb ebVar = f168700e;
                if (ebVar == null) {
                    synchronized (C62488dk.class) {
                        ebVar = f168700e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168699d);
                            f168700e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
