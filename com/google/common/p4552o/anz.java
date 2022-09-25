package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.anz */
/* compiled from: PG */
public final class anz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final anz f159422a;

    /* renamed from: b */
    private static volatile C63010eb f159423b;

    static {
        anz anz = new anz();
        f159422a = anz;
        C62942bv.registerDefaultInstance(anz.class, anz);
    }

    private anz() {
        emptyProtobufList();
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
                return newMessageInfo(f159422a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new anz();
            case 4:
                return new any();
            case 5:
                return f159422a;
            case 6:
                C63010eb ebVar = f159423b;
                if (ebVar == null) {
                    synchronized (anz.class) {
                        ebVar = f159423b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159422a);
                            f159423b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
