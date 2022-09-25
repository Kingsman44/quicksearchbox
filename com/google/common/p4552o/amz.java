package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.amz */
/* compiled from: PG */
public final class amz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final amz f159258c;

    /* renamed from: d */
    private static volatile C63010eb f159259d;

    /* renamed from: a */
    public int f159260a;

    /* renamed from: b */
    public amy f159261b;

    static {
        amz amz = new amz();
        f159258c = amz;
        C62942bv.registerDefaultInstance(amz.class, amz);
    }

    private amz() {
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
                return newMessageInfo(f159258c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new amz();
            case 4:
                return new amw();
            case 5:
                return f159258c;
            case 6:
                C63010eb ebVar = f159259d;
                if (ebVar == null) {
                    synchronized (amz.class) {
                        ebVar = f159259d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159258c);
                            f159259d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
