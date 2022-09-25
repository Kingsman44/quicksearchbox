package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fv */
/* compiled from: PG */
public final class C51085fv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51085fv f132995c;

    /* renamed from: d */
    private static volatile C63010eb f132996d;

    /* renamed from: a */
    public int f132997a;

    /* renamed from: b */
    public int f132998b;

    static {
        C51085fv fvVar = new C51085fv();
        f132995c = fvVar;
        C62942bv.registerDefaultInstance(C51085fv.class, fvVar);
    }

    private C51085fv() {
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
                return newMessageInfo(f132995c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51083ft.f132994a});
            case 3:
                return new C51085fv();
            case 4:
                return new C51082fs();
            case 5:
                return f132995c;
            case 6:
                C63010eb ebVar = f132996d;
                if (ebVar == null) {
                    synchronized (C51085fv.class) {
                        ebVar = f132996d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132995c);
                            f132996d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
