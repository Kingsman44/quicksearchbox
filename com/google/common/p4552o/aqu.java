package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aqu */
/* compiled from: PG */
public final class aqu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aqu f159793a;

    /* renamed from: b */
    private static volatile C63010eb f159794b;

    static {
        aqu aqu = new aqu();
        f159793a = aqu;
        C62942bv.registerDefaultInstance(aqu.class, aqu);
    }

    private aqu() {
        emptyIntList();
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
                return newMessageInfo(f159793a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aqu();
            case 4:
                return new aqt();
            case 5:
                return f159793a;
            case 6:
                C63010eb ebVar = f159794b;
                if (ebVar == null) {
                    synchronized (aqu.class) {
                        ebVar = f159794b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159793a);
                            f159794b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
