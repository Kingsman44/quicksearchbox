package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fr */
/* compiled from: PG */
public final class C51081fr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51081fr f132992a;

    /* renamed from: b */
    private static volatile C63010eb f132993b;

    static {
        C51081fr frVar = new C51081fr();
        f132992a = frVar;
        C62942bv.registerDefaultInstance(C51081fr.class, frVar);
    }

    private C51081fr() {
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
                return newMessageInfo(f132992a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51081fr();
            case 4:
                return new C51080fq();
            case 5:
                return f132992a;
            case 6:
                C63010eb ebVar = f132993b;
                if (ebVar == null) {
                    synchronized (C51081fr.class) {
                        ebVar = f132993b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132992a);
                            f132993b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
