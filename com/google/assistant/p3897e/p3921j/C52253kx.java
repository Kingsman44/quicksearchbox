package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.kx */
/* compiled from: PG */
public final class C52253kx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52253kx f137130c;

    /* renamed from: d */
    private static volatile C63010eb f137131d;

    /* renamed from: a */
    public int f137132a;

    /* renamed from: b */
    public int f137133b;

    static {
        C52253kx kxVar = new C52253kx();
        f137130c = kxVar;
        C62942bv.registerDefaultInstance(C52253kx.class, kxVar);
    }

    private C52253kx() {
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
                return newMessageInfo(f137130c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52252kw.m86554b()});
            case 3:
                return new C52253kx();
            case 4:
                return new C52250ku();
            case 5:
                return f137130c;
            case 6:
                C63010eb ebVar = f137131d;
                if (ebVar == null) {
                    synchronized (C52253kx.class) {
                        ebVar = f137131d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137130c);
                            f137131d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
