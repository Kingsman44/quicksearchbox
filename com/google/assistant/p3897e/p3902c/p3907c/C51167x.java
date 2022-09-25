package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.x */
/* compiled from: PG */
public final class C51167x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51167x f133196c;

    /* renamed from: f */
    private static volatile C63010eb f133197f;

    /* renamed from: a */
    public C51012dc f133198a;

    /* renamed from: b */
    public C51012dc f133199b;

    /* renamed from: d */
    private int f133200d;

    /* renamed from: e */
    private byte f133201e = 2;

    static {
        C51167x xVar = new C51167x();
        f133196c = xVar;
        C62942bv.registerDefaultInstance(C51167x.class, xVar);
    }

    private C51167x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133201e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133201e = b;
                return null;
            case 2:
                return newMessageInfo(f133196c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51167x();
            case 4:
                return new C51166w();
            case 5:
                return f133196c;
            case 6:
                C63010eb ebVar = f133197f;
                if (ebVar == null) {
                    synchronized (C51167x.class) {
                        ebVar = f133197f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133196c);
                            f133197f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
