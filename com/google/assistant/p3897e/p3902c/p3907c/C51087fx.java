package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fx */
/* compiled from: PG */
public final class C51087fx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51087fx f132999a;

    /* renamed from: b */
    private static volatile C63010eb f133000b;

    static {
        C51087fx fxVar = new C51087fx();
        f132999a = fxVar;
        C62942bv.registerDefaultInstance(C51087fx.class, fxVar);
    }

    private C51087fx() {
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
                return newMessageInfo(f132999a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51087fx();
            case 4:
                return new C51086fw();
            case 5:
                return f132999a;
            case 6:
                C63010eb ebVar = f133000b;
                if (ebVar == null) {
                    synchronized (C51087fx.class) {
                        ebVar = f133000b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132999a);
                            f133000b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
