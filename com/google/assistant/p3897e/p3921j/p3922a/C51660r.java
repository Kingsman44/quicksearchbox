package com.google.assistant.p3897e.p3921j.p3922a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.r */
/* compiled from: PG */
public final class C51660r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51660r f134605c;

    /* renamed from: d */
    private static volatile C63010eb f134606d;

    /* renamed from: a */
    public int f134607a = 0;

    /* renamed from: b */
    public Object f134608b;

    static {
        C51660r rVar = new C51660r();
        f134605c = rVar;
        C62942bv.registerDefaultInstance(C51660r.class, rVar);
    }

    private C51660r() {
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
                return newMessageInfo(f134605c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C51666x.class, C51658p.class});
            case 3:
                return new C51660r();
            case 4:
                return new C51659q();
            case 5:
                return f134605c;
            case 6:
                C63010eb ebVar = f134606d;
                if (ebVar == null) {
                    synchronized (C51660r.class) {
                        ebVar = f134606d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134605c);
                            f134606d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
