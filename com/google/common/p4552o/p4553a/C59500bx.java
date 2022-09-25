package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bx */
/* compiled from: PG */
public final class C59500bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59500bx f157874c;

    /* renamed from: d */
    private static volatile C63010eb f157875d;

    /* renamed from: a */
    public int f157876a;

    /* renamed from: b */
    public C59499bw f157877b;

    static {
        C59500bx bxVar = new C59500bx();
        f157874c = bxVar;
        C62942bv.registerDefaultInstance(C59500bx.class, bxVar);
    }

    private C59500bx() {
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
                return newMessageInfo(f157874c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59500bx();
            case 4:
                return new C59497bu();
            case 5:
                return f157874c;
            case 6:
                C63010eb ebVar = f157875d;
                if (ebVar == null) {
                    synchronized (C59500bx.class) {
                        ebVar = f157875d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157874c);
                            f157875d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
