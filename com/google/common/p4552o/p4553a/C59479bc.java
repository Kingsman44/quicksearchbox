package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bc */
/* compiled from: PG */
public final class C59479bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59479bc f157808c;

    /* renamed from: d */
    private static volatile C63010eb f157809d;

    /* renamed from: a */
    public int f157810a = 0;

    /* renamed from: b */
    public Object f157811b;

    static {
        C59479bc bcVar = new C59479bc();
        f157808c = bcVar;
        C62942bv.registerDefaultInstance(C59479bc.class, bcVar);
    }

    private C59479bc() {
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
                return newMessageInfo(f157808c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C59491bo.class, C59481be.class});
            case 3:
                return new C59479bc();
            case 4:
                return new C59478bb();
            case 5:
                return f157808c;
            case 6:
                C63010eb ebVar = f157809d;
                if (ebVar == null) {
                    synchronized (C59479bc.class) {
                        ebVar = f157809d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157808c);
                            f157809d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
