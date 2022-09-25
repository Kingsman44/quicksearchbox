package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fp */
/* compiled from: PG */
public final class C51079fp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51079fp f132990a;

    /* renamed from: b */
    private static volatile C63010eb f132991b;

    static {
        C51079fp fpVar = new C51079fp();
        f132990a = fpVar;
        C62942bv.registerDefaultInstance(C51079fp.class, fpVar);
    }

    private C51079fp() {
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
                return newMessageInfo(f132990a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51079fp();
            case 4:
                return new C51078fo();
            case 5:
                return f132990a;
            case 6:
                C63010eb ebVar = f132991b;
                if (ebVar == null) {
                    synchronized (C51079fp.class) {
                        ebVar = f132991b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132990a);
                            f132991b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
