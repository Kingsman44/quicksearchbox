package com.google.common.p4552o.p4564j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.j */
/* compiled from: PG */
public final class C60035j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60035j f162271c;

    /* renamed from: d */
    private static volatile C63010eb f162272d;

    /* renamed from: a */
    public int f162273a;

    /* renamed from: b */
    public int f162274b;

    static {
        C60035j jVar = new C60035j();
        f162271c = jVar;
        C62942bv.registerDefaultInstance(C60035j.class, jVar);
    }

    private C60035j() {
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
                return newMessageInfo(f162271c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60035j();
            case 4:
                return new C60034i();
            case 5:
                return f162271c;
            case 6:
                C63010eb ebVar = f162272d;
                if (ebVar == null) {
                    synchronized (C60035j.class) {
                        ebVar = f162272d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162271c);
                            f162272d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
