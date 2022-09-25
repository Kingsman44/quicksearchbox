package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gj */
/* compiled from: PG */
public final class C51100gj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51100gj f133015c;

    /* renamed from: d */
    private static volatile C63010eb f133016d;

    /* renamed from: a */
    public int f133017a = 0;

    /* renamed from: b */
    public Object f133018b;

    static {
        C51100gj gjVar = new C51100gj();
        f133015c = gjVar;
        C62942bv.registerDefaultInstance(C51100gj.class, gjVar);
    }

    private C51100gj() {
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
                return newMessageInfo(f133015c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C51061ey.class});
            case 3:
                return new C51100gj();
            case 4:
                return new C51099gi();
            case 5:
                return f133015c;
            case 6:
                C63010eb ebVar = f133016d;
                if (ebVar == null) {
                    synchronized (C51100gj.class) {
                        ebVar = f133016d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133015c);
                            f133016d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
