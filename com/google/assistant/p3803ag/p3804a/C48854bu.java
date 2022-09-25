package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.ag.a.bu */
/* compiled from: PG */
public final class C48854bu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48854bu f126419c;

    /* renamed from: e */
    private static volatile C63010eb f126420e;

    /* renamed from: a */
    public C63088z f126421a = C63088z.f170246b;

    /* renamed from: b */
    public int f126422b;

    /* renamed from: d */
    private int f126423d;

    static {
        C48854bu buVar = new C48854bu();
        f126419c = buVar;
        C62942bv.registerDefaultInstance(C48854bu.class, buVar);
    }

    private C48854bu() {
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
                return newMessageInfo(f126419c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C48844bk.f126396a});
            case 3:
                return new C48854bu();
            case 4:
                return new C48853bt();
            case 5:
                return f126419c;
            case 6:
                C63010eb ebVar = f126420e;
                if (ebVar == null) {
                    synchronized (C48854bu.class) {
                        ebVar = f126420e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126419c);
                            f126420e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
