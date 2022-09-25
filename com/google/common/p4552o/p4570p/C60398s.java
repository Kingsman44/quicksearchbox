package com.google.common.p4552o.p4570p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.s */
/* compiled from: PG */
public final class C60398s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60398s f163445a;

    /* renamed from: b */
    private static volatile C63010eb f163446b;

    static {
        C60398s sVar = new C60398s();
        f163445a = sVar;
        C62942bv.registerDefaultInstance(C60398s.class, sVar);
    }

    private C60398s() {
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
                return newMessageInfo(f163445a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60398s();
            case 4:
                return new C60397r();
            case 5:
                return f163445a;
            case 6:
                C63010eb ebVar = f163446b;
                if (ebVar == null) {
                    synchronized (C60398s.class) {
                        ebVar = f163446b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163445a);
                            f163446b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
