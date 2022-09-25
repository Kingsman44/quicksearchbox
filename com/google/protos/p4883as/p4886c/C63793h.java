package com.google.protos.p4883as.p4886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.c.h */
/* compiled from: PG */
public final class C63793h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63793h f172554a;

    /* renamed from: c */
    private static volatile C63010eb f172555c;

    /* renamed from: b */
    private C62995dn f172556b = C62995dn.f170057a;

    static {
        C63793h hVar = new C63793h();
        f172554a = hVar;
        C62942bv.registerDefaultInstance(C63793h.class, hVar);
    }

    private C63793h() {
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
                return newMessageInfo(f172554a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C63792g.f172553a});
            case 3:
                return new C63793h();
            case 4:
                return new C63791f();
            case 5:
                return f172554a;
            case 6:
                C63010eb ebVar = f172555c;
                if (ebVar == null) {
                    synchronized (C63793h.class) {
                        ebVar = f172555c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172554a);
                            f172555c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
