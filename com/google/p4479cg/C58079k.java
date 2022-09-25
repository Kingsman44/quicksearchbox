package com.google.p4479cg;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cg.k */
/* compiled from: PG */
public final class C58079k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C58079k f155250c;

    /* renamed from: d */
    private static volatile C63010eb f155251d;

    /* renamed from: a */
    public double f155252a;

    /* renamed from: b */
    public double f155253b;

    static {
        C58079k kVar = new C58079k();
        f155250c = kVar;
        C62942bv.registerDefaultInstance(C58079k.class, kVar);
    }

    private C58079k() {
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
                return newMessageInfo(f155250c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"a", "b"});
            case 3:
                return new C58079k();
            case 4:
                return new C58078j();
            case 5:
                return f155250c;
            case 6:
                C63010eb ebVar = f155251d;
                if (ebVar == null) {
                    synchronized (C58079k.class) {
                        ebVar = f155251d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155250c);
                            f155251d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
