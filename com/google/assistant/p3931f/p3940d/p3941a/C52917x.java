package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.x */
/* compiled from: PG */
public final class C52917x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52917x f138760b;

    /* renamed from: c */
    private static volatile C63010eb f138761c;

    /* renamed from: a */
    public int f138762a;

    static {
        C52917x xVar = new C52917x();
        f138760b = xVar;
        C62942bv.registerDefaultInstance(C52917x.class, xVar);
    }

    private C52917x() {
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
                return newMessageInfo(f138760b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C52917x();
            case 4:
                return new C52916w();
            case 5:
                return f138760b;
            case 6:
                C63010eb ebVar = f138761c;
                if (ebVar == null) {
                    synchronized (C52917x.class) {
                        ebVar = f138761c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138760b);
                            f138761c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
