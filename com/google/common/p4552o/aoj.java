package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aoj */
/* compiled from: PG */
public final class aoj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aoj f159492a;

    /* renamed from: b */
    private static volatile C63010eb f159493b;

    static {
        aoj aoj = new aoj();
        f159492a = aoj;
        C62942bv.registerDefaultInstance(aoj.class, aoj);
    }

    private aoj() {
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
                return newMessageInfo(f159492a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aoj();
            case 4:
                return new aoi();
            case 5:
                return f159492a;
            case 6:
                C63010eb ebVar = f159493b;
                if (ebVar == null) {
                    synchronized (aoj.class) {
                        ebVar = f159493b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159492a);
                            f159493b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
