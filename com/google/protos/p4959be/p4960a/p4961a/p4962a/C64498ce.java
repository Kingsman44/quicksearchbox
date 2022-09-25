package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ce */
/* compiled from: PG */
public final class C64498ce extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64498ce f174931b;

    /* renamed from: c */
    private static volatile C63010eb f174932c;

    /* renamed from: a */
    public C62971cq f174933a = emptyProtobufList();

    static {
        C64498ce ceVar = new C64498ce();
        f174931b = ceVar;
        C62942bv.registerDefaultInstance(C64498ce.class, ceVar);
    }

    private C64498ce() {
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
                return newMessageInfo(f174931b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64497cd.class});
            case 3:
                return new C64498ce();
            case 4:
                return new C64495cb();
            case 5:
                return f174931b;
            case 6:
                C63010eb ebVar = f174932c;
                if (ebVar == null) {
                    synchronized (C64498ce.class) {
                        ebVar = f174932c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174931b);
                            f174932c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
