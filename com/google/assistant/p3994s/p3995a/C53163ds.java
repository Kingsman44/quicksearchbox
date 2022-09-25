package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ds */
/* compiled from: PG */
public final class C53163ds extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53163ds f139336a;

    /* renamed from: b */
    private static volatile C63010eb f139337b;

    static {
        C53163ds dsVar = new C53163ds();
        f139336a = dsVar;
        C62942bv.registerDefaultInstance(C53163ds.class, dsVar);
    }

    private C53163ds() {
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
                return newMessageInfo(f139336a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53163ds();
            case 4:
                return new C53162dr();
            case 5:
                return f139336a;
            case 6:
                C63010eb ebVar = f139337b;
                if (ebVar == null) {
                    synchronized (C53163ds.class) {
                        ebVar = f139337b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139336a);
                            f139337b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
