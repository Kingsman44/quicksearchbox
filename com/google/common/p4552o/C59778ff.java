package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ff */
/* compiled from: PG */
public final class C59778ff extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59778ff f161522b;

    /* renamed from: c */
    private static volatile C63010eb f161523c;

    /* renamed from: a */
    public C62971cq f161524a = emptyProtobufList();

    static {
        C59778ff ffVar = new C59778ff();
        f161522b = ffVar;
        C62942bv.registerDefaultInstance(C59778ff.class, ffVar);
    }

    private C59778ff() {
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
                return newMessageInfo(f161522b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59776fd.class});
            case 3:
                return new C59778ff();
            case 4:
                return new C59777fe();
            case 5:
                return f161522b;
            case 6:
                C63010eb ebVar = f161523c;
                if (ebVar == null) {
                    synchronized (C59778ff.class) {
                        ebVar = f161523c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161522b);
                            f161523c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
