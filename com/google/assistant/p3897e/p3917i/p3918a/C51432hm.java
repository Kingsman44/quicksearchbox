package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.hm */
/* compiled from: PG */
public final class C51432hm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51432hm f133955c;

    /* renamed from: d */
    private static volatile C63010eb f133956d;

    /* renamed from: a */
    public int f133957a = 0;

    /* renamed from: b */
    public Object f133958b;

    static {
        C51432hm hmVar = new C51432hm();
        f133955c = hmVar;
        C62942bv.registerDefaultInstance(C51432hm.class, hmVar);
    }

    private C51432hm() {
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
                return newMessageInfo(f133955c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001့\u0000\u0002ြ\u0000", new Object[]{"b", "a", C51430hk.class});
            case 3:
                return new C51432hm();
            case 4:
                return new C51431hl();
            case 5:
                return f133955c;
            case 6:
                C63010eb ebVar = f133956d;
                if (ebVar == null) {
                    synchronized (C51432hm.class) {
                        ebVar = f133956d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133955c);
                            f133956d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
