package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.bu */
/* compiled from: PG */
public final class C48632bu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48632bu f125675a;

    /* renamed from: b */
    private static volatile C63010eb f125676b;

    static {
        C48632bu buVar = new C48632bu();
        f125675a = buVar;
        C62942bv.registerDefaultInstance(C48632bu.class, buVar);
    }

    private C48632bu() {
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
                return newMessageInfo(f125675a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48632bu();
            case 4:
                return new C48631bt();
            case 5:
                return f125675a;
            case 6:
                C63010eb ebVar = f125676b;
                if (ebVar == null) {
                    synchronized (C48632bu.class) {
                        ebVar = f125676b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125675a);
                            f125676b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
