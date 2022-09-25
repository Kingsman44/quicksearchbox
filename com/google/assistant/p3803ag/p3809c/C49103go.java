package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.go */
/* compiled from: PG */
public final class C49103go extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49103go f126995c;

    /* renamed from: d */
    private static volatile C63010eb f126996d;

    /* renamed from: a */
    public int f126997a;

    /* renamed from: b */
    public C49099gk f126998b;

    static {
        C49103go goVar = new C49103go();
        f126995c = goVar;
        C62942bv.registerDefaultInstance(C49103go.class, goVar);
    }

    private C49103go() {
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
                return newMessageInfo(f126995c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49103go();
            case 4:
                return new C49102gn();
            case 5:
                return f126995c;
            case 6:
                C63010eb ebVar = f126996d;
                if (ebVar == null) {
                    synchronized (C49103go.class) {
                        ebVar = f126996d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126995c);
                            f126996d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
