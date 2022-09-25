package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.dg */
/* compiled from: PG */
public final class C65146dg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65146dg f176320a;

    /* renamed from: b */
    private static volatile C63010eb f176321b;

    static {
        C65146dg dgVar = new C65146dg();
        f176320a = dgVar;
        C62942bv.registerDefaultInstance(C65146dg.class, dgVar);
    }

    private C65146dg() {
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
                return newMessageInfo(f176320a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65146dg();
            case 4:
                return new C65145df();
            case 5:
                return f176320a;
            case 6:
                C63010eb ebVar = f176321b;
                if (ebVar == null) {
                    synchronized (C65146dg.class) {
                        ebVar = f176321b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176320a);
                            f176321b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
