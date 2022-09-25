package com.google.p4184bj.p4189b.p4190a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.a.h */
/* compiled from: PG */
public final class C55876h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55876h f148687c;

    /* renamed from: d */
    private static volatile C63010eb f148688d;

    /* renamed from: a */
    public int f148689a = 0;

    /* renamed from: b */
    public Object f148690b;

    static {
        C55876h hVar = new C55876h();
        f148687c = hVar;
        C62942bv.registerDefaultInstance(C55876h.class, hVar);
    }

    private C55876h() {
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
                return newMessageInfo(f148687c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C55875g.class, C55873e.class});
            case 3:
                return new C55876h();
            case 4:
                return new C55869a();
            case 5:
                return f148687c;
            case 6:
                C63010eb ebVar = f148688d;
                if (ebVar == null) {
                    synchronized (C55876h.class) {
                        ebVar = f148688d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148687c);
                            f148688d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
