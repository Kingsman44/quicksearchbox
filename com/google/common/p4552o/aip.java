package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aip */
/* compiled from: PG */
public final class aip extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aip f158826c;

    /* renamed from: d */
    private static volatile C63010eb f158827d;

    /* renamed from: a */
    public int f158828a;

    /* renamed from: b */
    public int f158829b;

    static {
        aip aip = new aip();
        f158826c = aip;
        C62942bv.registerDefaultInstance(aip.class, aip);
    }

    private aip() {
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
                return newMessageInfo(f158826c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aio.f158825a});
            case 3:
                return new aip();
            case 4:
                return new ain();
            case 5:
                return f158826c;
            case 6:
                C63010eb ebVar = f158827d;
                if (ebVar == null) {
                    synchronized (aip.class) {
                        ebVar = f158827d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158826c);
                            f158827d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
