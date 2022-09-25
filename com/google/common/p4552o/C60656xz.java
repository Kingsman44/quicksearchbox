package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xz */
/* compiled from: PG */
public final class C60656xz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60656xz f164553c;

    /* renamed from: d */
    private static volatile C63010eb f164554d;

    /* renamed from: a */
    public int f164555a;

    /* renamed from: b */
    public int f164556b;

    static {
        C60656xz xzVar = new C60656xz();
        f164553c = xzVar;
        C62942bv.registerDefaultInstance(C60656xz.class, xzVar);
    }

    private C60656xz() {
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
                return newMessageInfo(f164553c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60655xy.f164552a});
            case 3:
                return new C60656xz();
            case 4:
                return new C60654xx();
            case 5:
                return f164553c;
            case 6:
                C63010eb ebVar = f164554d;
                if (ebVar == null) {
                    synchronized (C60656xz.class) {
                        ebVar = f164554d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164553c);
                            f164554d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
