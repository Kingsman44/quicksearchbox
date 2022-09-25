package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.ch */
/* compiled from: PG */
public final class C60170ch extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60170ch f162767b;

    /* renamed from: c */
    private static volatile C63010eb f162768c;

    /* renamed from: a */
    public C62971cq f162769a = emptyProtobufList();

    static {
        C60170ch chVar = new C60170ch();
        f162767b = chVar;
        C62942bv.registerDefaultInstance(C60170ch.class, chVar);
    }

    private C60170ch() {
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
                return newMessageInfo(f162767b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C60168cf.class});
            case 3:
                return new C60170ch();
            case 4:
                return new C60169cg();
            case 5:
                return f162767b;
            case 6:
                C63010eb ebVar = f162768c;
                if (ebVar == null) {
                    synchronized (C60170ch.class) {
                        ebVar = f162768c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162767b);
                            f162768c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
