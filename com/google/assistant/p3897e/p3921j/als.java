package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.als */
/* compiled from: PG */
public final class als extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final als f135346c;

    /* renamed from: d */
    private static volatile C63010eb f135347d;

    /* renamed from: a */
    public int f135348a;

    /* renamed from: b */
    public int f135349b;

    static {
        als als = new als();
        f135346c = als;
        C62942bv.registerDefaultInstance(als.class, als);
    }

    private als() {
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
                return newMessageInfo(f135346c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new als();
            case 4:
                return new alr();
            case 5:
                return f135346c;
            case 6:
                C63010eb ebVar = f135347d;
                if (ebVar == null) {
                    synchronized (als.class) {
                        ebVar = f135347d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135346c);
                            f135347d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
