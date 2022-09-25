package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qd */
/* compiled from: PG */
public final class C60441qd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60441qd f163569a;

    /* renamed from: b */
    private static volatile C63010eb f163570b;

    static {
        C60441qd qdVar = new C60441qd();
        f163569a = qdVar;
        C62942bv.registerDefaultInstance(C60441qd.class, qdVar);
    }

    private C60441qd() {
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
                return newMessageInfo(f163569a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60441qd();
            case 4:
                return new C60440qc();
            case 5:
                return f163569a;
            case 6:
                C63010eb ebVar = f163570b;
                if (ebVar == null) {
                    synchronized (C60441qd.class) {
                        ebVar = f163570b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163569a);
                            f163570b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
