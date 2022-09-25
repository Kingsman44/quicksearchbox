package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.l */
/* compiled from: PG */
public final class C51155l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51155l f133165a;

    /* renamed from: b */
    private static volatile C63010eb f133166b;

    static {
        C51155l lVar = new C51155l();
        f133165a = lVar;
        C62942bv.registerDefaultInstance(C51155l.class, lVar);
    }

    private C51155l() {
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
                return newMessageInfo(f133165a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51155l();
            case 4:
                return new C51154k();
            case 5:
                return f133165a;
            case 6:
                C63010eb ebVar = f133166b;
                if (ebVar == null) {
                    synchronized (C51155l.class) {
                        ebVar = f133166b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133165a);
                            f133166b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
