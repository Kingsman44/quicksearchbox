package com.google.assistant.p3989p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.p.h */
/* compiled from: PG */
public final class C53055h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53055h f139049a;

    /* renamed from: b */
    private static volatile C63010eb f139050b;

    static {
        C53055h hVar = new C53055h();
        f139049a = hVar;
        C62942bv.registerDefaultInstance(C53055h.class, hVar);
    }

    private C53055h() {
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
                return newMessageInfo(f139049a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53055h();
            case 4:
                return new C53054g();
            case 5:
                return f139049a;
            case 6:
                C63010eb ebVar = f139050b;
                if (ebVar == null) {
                    synchronized (C53055h.class) {
                        ebVar = f139050b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139049a);
                            f139050b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
