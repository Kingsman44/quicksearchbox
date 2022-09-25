package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.amy */
/* compiled from: PG */
public final class amy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final amy f159254c;

    /* renamed from: d */
    private static volatile C63010eb f159255d;

    /* renamed from: a */
    public int f159256a;

    /* renamed from: b */
    public int f159257b;

    static {
        amy amy = new amy();
        f159254c = amy;
        C62942bv.registerDefaultInstance(amy.class, amy);
    }

    private amy() {
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
                return newMessageInfo(f159254c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new amy();
            case 4:
                return new amx();
            case 5:
                return f159254c;
            case 6:
                C63010eb ebVar = f159255d;
                if (ebVar == null) {
                    synchronized (amy.class) {
                        ebVar = f159255d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159254c);
                            f159255d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
