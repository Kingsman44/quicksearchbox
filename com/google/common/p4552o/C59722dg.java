package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.dg */
/* compiled from: PG */
public final class C59722dg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C59722dg f160302a;

    /* renamed from: b */
    private static volatile C63010eb f160303b;

    static {
        C59722dg dgVar = new C59722dg();
        f160302a = dgVar;
        C62942bv.registerDefaultInstance(C59722dg.class, dgVar);
    }

    private C59722dg() {
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
                return newMessageInfo(f160302a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C59722dg();
            case 4:
                return new C59721df();
            case 5:
                return f160302a;
            case 6:
                C63010eb ebVar = f160303b;
                if (ebVar == null) {
                    synchronized (C59722dg.class) {
                        ebVar = f160303b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160302a);
                            f160303b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
