package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fg */
/* compiled from: PG */
public final class C51070fg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51070fg f132974a;

    /* renamed from: b */
    private static volatile C63010eb f132975b;

    static {
        C51070fg fgVar = new C51070fg();
        f132974a = fgVar;
        C62942bv.registerDefaultInstance(C51070fg.class, fgVar);
    }

    private C51070fg() {
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
                return newMessageInfo(f132974a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51070fg();
            case 4:
                return new C51069ff();
            case 5:
                return f132974a;
            case 6:
                C63010eb ebVar = f132975b;
                if (ebVar == null) {
                    synchronized (C51070fg.class) {
                        ebVar = f132975b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132974a);
                            f132975b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
