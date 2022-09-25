package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cl */
/* compiled from: PG */
public final class C59930cl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59930cl f161974c;

    /* renamed from: d */
    private static volatile C63010eb f161975d;

    /* renamed from: a */
    public int f161976a;

    /* renamed from: b */
    public int f161977b;

    static {
        C59930cl clVar = new C59930cl();
        f161974c = clVar;
        C62942bv.registerDefaultInstance(C59930cl.class, clVar);
    }

    private C59930cl() {
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
                return newMessageInfo(f161974c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59929ck.f161973a});
            case 3:
                return new C59930cl();
            case 4:
                return new C59928cj();
            case 5:
                return f161974c;
            case 6:
                C63010eb ebVar = f161975d;
                if (ebVar == null) {
                    synchronized (C59930cl.class) {
                        ebVar = f161975d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161974c);
                            f161975d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
