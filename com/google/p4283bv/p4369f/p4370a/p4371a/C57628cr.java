package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.cr */
/* compiled from: PG */
public final class C57628cr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57628cr f153925a;

    /* renamed from: b */
    private static volatile C63010eb f153926b;

    static {
        C57628cr crVar = new C57628cr();
        f153925a = crVar;
        C62942bv.registerDefaultInstance(C57628cr.class, crVar);
    }

    private C57628cr() {
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
                return newMessageInfo(f153925a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57628cr();
            case 4:
                return new C57627cq();
            case 5:
                return f153925a;
            case 6:
                C63010eb ebVar = f153926b;
                if (ebVar == null) {
                    synchronized (C57628cr.class) {
                        ebVar = f153926b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153925a);
                            f153926b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
