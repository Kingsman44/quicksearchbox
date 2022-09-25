package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.dg */
/* compiled from: PG */
public final class C59537dg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59537dg f157985b;

    /* renamed from: c */
    private static volatile C63010eb f157986c;

    /* renamed from: a */
    public C62971cq f157987a = emptyProtobufList();

    static {
        C59537dg dgVar = new C59537dg();
        f157985b = dgVar;
        C62942bv.registerDefaultInstance(C59537dg.class, dgVar);
    }

    private C59537dg() {
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
                return newMessageInfo(f157985b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59536df.class});
            case 3:
                return new C59537dg();
            case 4:
                return new C59533dc();
            case 5:
                return f157985b;
            case 6:
                C63010eb ebVar = f157986c;
                if (ebVar == null) {
                    synchronized (C59537dg.class) {
                        ebVar = f157986c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157985b);
                            f157986c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
