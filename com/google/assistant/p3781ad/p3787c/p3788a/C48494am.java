package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.am */
/* compiled from: PG */
public final class C48494am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48494am f125270c;

    /* renamed from: d */
    private static volatile C63010eb f125271d;

    /* renamed from: a */
    public int f125272a;

    /* renamed from: b */
    public float f125273b;

    static {
        C48494am amVar = new C48494am();
        f125270c = amVar;
        C62942bv.registerDefaultInstance(C48494am.class, amVar);
    }

    private C48494am() {
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
                return newMessageInfo(f125270c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48494am();
            case 4:
                return new C48493al();
            case 5:
                return f125270c;
            case 6:
                C63010eb ebVar = f125271d;
                if (ebVar == null) {
                    synchronized (C48494am.class) {
                        ebVar = f125271d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125270c);
                            f125271d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
