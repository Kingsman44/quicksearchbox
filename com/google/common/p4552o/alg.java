package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.alg */
/* compiled from: PG */
public final class alg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final alg f159026b;

    /* renamed from: c */
    private static volatile C63010eb f159027c;

    /* renamed from: a */
    public C62971cq f159028a = emptyProtobufList();

    static {
        alg alg = new alg();
        f159026b = alg;
        C62942bv.registerDefaultInstance(alg.class, alg);
    }

    private alg() {
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
                return newMessageInfo(f159026b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ald.class});
            case 3:
                return new alg();
            case 4:
                return new akz();
            case 5:
                return f159026b;
            case 6:
                C63010eb ebVar = f159027c;
                if (ebVar == null) {
                    synchronized (alg.class) {
                        ebVar = f159027c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159026b);
                            f159027c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
