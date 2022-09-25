package com.google.protos.p4816ai.p4818b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.b.h */
/* compiled from: PG */
public final class C63202h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63202h f170745c;

    /* renamed from: d */
    private static volatile C63010eb f170746d;

    /* renamed from: a */
    public int f170747a;

    /* renamed from: b */
    public int f170748b;

    static {
        C63202h hVar = new C63202h();
        f170745c = hVar;
        C62942bv.registerDefaultInstance(C63202h.class, hVar);
    }

    private C63202h() {
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
                return newMessageInfo(f170745c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005င\u0001", new Object[]{"a", "b"});
            case 3:
                return new C63202h();
            case 4:
                return new C63201g();
            case 5:
                return f170745c;
            case 6:
                C63010eb ebVar = f170746d;
                if (ebVar == null) {
                    synchronized (C63202h.class) {
                        ebVar = f170746d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170745c);
                            f170746d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
