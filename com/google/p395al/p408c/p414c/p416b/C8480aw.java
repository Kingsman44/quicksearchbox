package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.aw */
/* compiled from: PG */
public final class C8480aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8480aw f29435c;

    /* renamed from: e */
    private static volatile C63010eb f29436e;

    /* renamed from: a */
    public int f29437a;

    /* renamed from: b */
    public int f29438b;

    /* renamed from: d */
    private int f29439d;

    static {
        C8480aw awVar = new C8480aw();
        f29435c = awVar;
        C62942bv.registerDefaultInstance(C8480aw.class, awVar);
    }

    private C8480aw() {
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
                return newMessageInfo(f29435c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8480aw();
            case 4:
                return new C8479av();
            case 5:
                return f29435c;
            case 6:
                C63010eb ebVar = f29436e;
                if (ebVar == null) {
                    synchronized (C8480aw.class) {
                        ebVar = f29436e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29435c);
                            f29436e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
