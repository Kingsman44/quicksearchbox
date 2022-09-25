package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.if */
/* compiled from: PG */
public final class C59982if extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59982if f162104b;

    /* renamed from: c */
    private static volatile C63010eb f162105c;

    /* renamed from: a */
    public C62971cq f162106a = emptyProtobufList();

    static {
        C59982if ifVar = new C59982if();
        f162104b = ifVar;
        C62942bv.registerDefaultInstance(C59982if.class, ifVar);
    }

    private C59982if() {
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
                return newMessageInfo(f162104b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C59980id.class});
            case 3:
                return new C59982if();
            case 4:
                return new C59981ie();
            case 5:
                return f162104b;
            case 6:
                C63010eb ebVar = f162105c;
                if (ebVar == null) {
                    synchronized (C59982if.class) {
                        ebVar = f162105c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162104b);
                            f162105c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
