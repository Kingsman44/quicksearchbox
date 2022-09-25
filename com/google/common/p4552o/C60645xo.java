package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xo */
/* compiled from: PG */
public final class C60645xo extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60645xo f164528d;

    /* renamed from: e */
    private static volatile C63010eb f164529e;

    /* renamed from: a */
    public int f164530a;

    /* renamed from: b */
    public int f164531b;

    /* renamed from: c */
    public C62961ch f164532c = emptyIntList();

    static {
        C60645xo xoVar = new C60645xo();
        f164528d = xoVar;
        C62942bv.registerDefaultInstance(C60645xo.class, xoVar);
    }

    private C60645xo() {
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
                return newMessageInfo(f164528d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0016", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60645xo();
            case 4:
                return new C60644xn();
            case 5:
                return f164528d;
            case 6:
                C63010eb ebVar = f164529e;
                if (ebVar == null) {
                    synchronized (C60645xo.class) {
                        ebVar = f164529e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164528d);
                            f164529e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
