package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aab */
/* compiled from: PG */
public final class aab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aab f158075c;

    /* renamed from: d */
    private static volatile C63010eb f158076d;

    /* renamed from: a */
    public int f158077a;

    /* renamed from: b */
    public int f158078b;

    static {
        aab aab = new aab();
        f158075c = aab;
        C62942bv.registerDefaultInstance(aab.class, aab);
    }

    private aab() {
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
                return newMessageInfo(f158075c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new aab();
            case 4:
                return new aaa();
            case 5:
                return f158075c;
            case 6:
                C63010eb ebVar = f158076d;
                if (ebVar == null) {
                    synchronized (aab.class) {
                        ebVar = f158076d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158075c);
                            f158076d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
