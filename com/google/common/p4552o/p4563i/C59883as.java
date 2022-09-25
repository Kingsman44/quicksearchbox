package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.as */
/* compiled from: PG */
public final class C59883as extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59883as f161820b;

    /* renamed from: c */
    private static volatile C63010eb f161821c;

    /* renamed from: a */
    public C62961ch f161822a = emptyIntList();

    static {
        C59883as asVar = new C59883as();
        f161820b = asVar;
        C62942bv.registerDefaultInstance(C59883as.class, asVar);
    }

    private C59883as() {
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
                return newMessageInfo(f161820b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C59882ar.f161819a});
            case 3:
                return new C59883as();
            case 4:
                return new C59881aq();
            case 5:
                return f161820b;
            case 6:
                C63010eb ebVar = f161821c;
                if (ebVar == null) {
                    synchronized (C59883as.class) {
                        ebVar = f161821c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161820b);
                            f161821c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
