package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.n */
/* compiled from: PG */
public final class C65688n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65688n f178475c;

    /* renamed from: d */
    private static volatile C63010eb f178476d;

    /* renamed from: a */
    public int f178477a;

    /* renamed from: b */
    public int f178478b;

    static {
        C65688n nVar = new C65688n();
        f178475c = nVar;
        C62942bv.registerDefaultInstance(C65688n.class, nVar);
    }

    private C65688n() {
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
                return newMessageInfo(f178475c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C65689o.f178479a});
            case 3:
                return new C65688n();
            case 4:
                return new C65687m();
            case 5:
                return f178475c;
            case 6:
                C63010eb ebVar = f178476d;
                if (ebVar == null) {
                    synchronized (C65688n.class) {
                        ebVar = f178476d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178475c);
                            f178476d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
