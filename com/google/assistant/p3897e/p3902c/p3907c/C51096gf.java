package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gf */
/* compiled from: PG */
public final class C51096gf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51096gf f133007a;

    /* renamed from: b */
    private static volatile C63010eb f133008b;

    static {
        C51096gf gfVar = new C51096gf();
        f133007a = gfVar;
        C62942bv.registerDefaultInstance(C51096gf.class, gfVar);
    }

    private C51096gf() {
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
                return newMessageInfo(f133007a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51096gf();
            case 4:
                return new C51095ge();
            case 5:
                return f133007a;
            case 6:
                C63010eb ebVar = f133008b;
                if (ebVar == null) {
                    synchronized (C51096gf.class) {
                        ebVar = f133008b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133007a);
                            f133008b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
