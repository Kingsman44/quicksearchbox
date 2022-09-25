package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gt */
/* compiled from: PG */
public final class C51110gt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51110gt f133029a;

    /* renamed from: b */
    private static volatile C63010eb f133030b;

    static {
        C51110gt gtVar = new C51110gt();
        f133029a = gtVar;
        C62942bv.registerDefaultInstance(C51110gt.class, gtVar);
    }

    private C51110gt() {
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
                return newMessageInfo(f133029a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51110gt();
            case 4:
                return new C51109gs();
            case 5:
                return f133029a;
            case 6:
                C63010eb ebVar = f133030b;
                if (ebVar == null) {
                    synchronized (C51110gt.class) {
                        ebVar = f133030b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133029a);
                            f133030b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
