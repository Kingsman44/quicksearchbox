package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.br */
/* compiled from: PG */
public final class C59909br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59909br f161915c;

    /* renamed from: d */
    private static volatile C63010eb f161916d;

    /* renamed from: a */
    public int f161917a;

    /* renamed from: b */
    public int f161918b;

    static {
        C59909br brVar = new C59909br();
        f161915c = brVar;
        C62942bv.registerDefaultInstance(C59909br.class, brVar);
    }

    private C59909br() {
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
                return newMessageInfo(f161915c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59909br();
            case 4:
                return new C59908bq();
            case 5:
                return f161915c;
            case 6:
                C63010eb ebVar = f161916d;
                if (ebVar == null) {
                    synchronized (C59909br.class) {
                        ebVar = f161916d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161915c);
                            f161916d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
