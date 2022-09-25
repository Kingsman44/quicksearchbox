package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.dm */
/* compiled from: PG */
public final class C53157dm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53157dm f139323c;

    /* renamed from: d */
    private static volatile C63010eb f139324d;

    /* renamed from: a */
    public int f139325a = 0;

    /* renamed from: b */
    public Object f139326b;

    static {
        C53157dm dmVar = new C53157dm();
        f139323c = dmVar;
        C62942bv.registerDefaultInstance(C53157dm.class, dmVar);
    }

    private C53157dm() {
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
                return newMessageInfo(f139323c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C53161dq.class, C53159do.class});
            case 3:
                return new C53157dm();
            case 4:
                return new C53156dl();
            case 5:
                return f139323c;
            case 6:
                C63010eb ebVar = f139324d;
                if (ebVar == null) {
                    synchronized (C53157dm.class) {
                        ebVar = f139324d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139323c);
                            f139324d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
