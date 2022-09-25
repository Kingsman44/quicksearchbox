package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.cc */
/* compiled from: PG */
public final class C48983cc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48983cc f126720a;

    /* renamed from: b */
    private static volatile C63010eb f126721b;

    static {
        C48983cc ccVar = new C48983cc();
        f126720a = ccVar;
        C62942bv.registerDefaultInstance(C48983cc.class, ccVar);
    }

    private C48983cc() {
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
                return newMessageInfo(f126720a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48983cc();
            case 4:
                return new C48982cb();
            case 5:
                return f126720a;
            case 6:
                C63010eb ebVar = f126721b;
                if (ebVar == null) {
                    synchronized (C48983cc.class) {
                        ebVar = f126721b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126720a);
                            f126721b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
