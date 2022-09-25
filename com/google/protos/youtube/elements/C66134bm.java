package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.bm */
/* compiled from: PG */
public final class C66134bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66134bm f179838c;

    /* renamed from: d */
    private static volatile C63010eb f179839d;

    /* renamed from: a */
    public int f179840a = 0;

    /* renamed from: b */
    public Object f179841b;

    static {
        C66134bm bmVar = new C66134bm();
        f179838c = bmVar;
        C62942bv.registerDefaultInstance(C66134bm.class, bmVar);
    }

    private C66134bm() {
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
                return newMessageInfo(f179838c, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဴ\u0000\u0003ျ\u0000\u0004်\u0000\u0005ွ\u0000\u0006ြ\u0000\u0007ြ\u0000\b့\u0000\tှ\u0000", new Object[]{"b", "a", C66129bh.f179832a, C66132bk.class, C66122ba.class});
            case 3:
                return new C66134bm();
            case 4:
                return new C66133bl();
            case 5:
                return f179838c;
            case 6:
                C63010eb ebVar = f179839d;
                if (ebVar == null) {
                    synchronized (C66134bm.class) {
                        ebVar = f179839d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179838c);
                            f179839d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
