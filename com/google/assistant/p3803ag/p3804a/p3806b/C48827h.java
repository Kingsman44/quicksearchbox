package com.google.assistant.p3803ag.p3804a.p3806b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.b.h */
/* compiled from: PG */
public final class C48827h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48827h f126328c;

    /* renamed from: e */
    private static volatile C63010eb f126329e;

    /* renamed from: a */
    public float f126330a;

    /* renamed from: b */
    public float f126331b;

    /* renamed from: d */
    private int f126332d;

    static {
        C48827h hVar = new C48827h();
        f126328c = hVar;
        C62942bv.registerDefaultInstance(C48827h.class, hVar);
    }

    private C48827h() {
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
                return newMessageInfo(f126328c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C48827h();
            case 4:
                return new C48826g();
            case 5:
                return f126328c;
            case 6:
                C63010eb ebVar = f126329e;
                if (ebVar == null) {
                    synchronized (C48827h.class) {
                        ebVar = f126329e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126328c);
                            f126329e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
