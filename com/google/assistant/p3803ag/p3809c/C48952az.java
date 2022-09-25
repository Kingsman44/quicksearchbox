package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.az */
/* compiled from: PG */
public final class C48952az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48952az f126657c;

    /* renamed from: d */
    private static volatile C63010eb f126658d;

    /* renamed from: a */
    public int f126659a = 0;

    /* renamed from: b */
    public Object f126660b;

    static {
        C48952az azVar = new C48952az();
        f126657c = azVar;
        C62942bv.registerDefaultInstance(C48952az.class, azVar);
    }

    private C48952az() {
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
                return newMessageInfo(f126657c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C48971br.class, C48951ay.class, C48951ay.class, C48952az.class});
            case 3:
                return new C48952az();
            case 4:
                return new C48948av();
            case 5:
                return f126657c;
            case 6:
                C63010eb ebVar = f126658d;
                if (ebVar == null) {
                    synchronized (C48952az.class) {
                        ebVar = f126658d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126657c);
                            f126658d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
