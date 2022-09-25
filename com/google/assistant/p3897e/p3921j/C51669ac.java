package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ac */
/* compiled from: PG */
public final class C51669ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51669ac f134786c;

    /* renamed from: d */
    private static volatile C63010eb f134787d;

    /* renamed from: a */
    public int f134788a = 0;

    /* renamed from: b */
    public Object f134789b;

    static {
        C51669ac acVar = new C51669ac();
        f134786c = acVar;
        C62942bv.registerDefaultInstance(C51669ac.class, acVar);
    }

    private C51669ac() {
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
                return newMessageInfo(f134786c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C52634z.class, C51668ab.class, C52580x.class});
            case 3:
                return new C51669ac();
            case 4:
                return new C52526v();
            case 5:
                return f134786c;
            case 6:
                C63010eb ebVar = f134787d;
                if (ebVar == null) {
                    synchronized (C51669ac.class) {
                        ebVar = f134787d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134786c);
                            f134787d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
