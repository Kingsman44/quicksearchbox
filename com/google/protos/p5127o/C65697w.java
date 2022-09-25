package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.protos.o.w */
/* compiled from: PG */
public final class C65697w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65697w f178495c;

    /* renamed from: e */
    private static volatile C63010eb f178496e;

    /* renamed from: a */
    public int f178497a = 0;

    /* renamed from: b */
    public Object f178498b;

    /* renamed from: d */
    private byte f178499d = 2;

    static {
        C65697w wVar = new C65697w();
        f178495c = wVar;
        C62942bv.registerDefaultInstance(C65697w.class, wVar);
    }

    private C65697w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178499d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178499d = b;
                return null;
            case 2:
                return newMessageInfo(f178495c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C63070h.class, C65699y.class});
            case 3:
                return new C65697w();
            case 4:
                return new C65696v();
            case 5:
                return f178495c;
            case 6:
                C63010eb ebVar = f178496e;
                if (ebVar == null) {
                    synchronized (C65697w.class) {
                        ebVar = f178496e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178495c);
                            f178496e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
