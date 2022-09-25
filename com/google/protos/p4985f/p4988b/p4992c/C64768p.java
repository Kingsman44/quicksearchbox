package com.google.protos.p4985f.p4988b.p4992c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.c.p */
/* compiled from: PG */
public final class C64768p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64768p f175564b;

    /* renamed from: c */
    private static volatile C63010eb f175565c;

    /* renamed from: a */
    public C62971cq f175566a = emptyProtobufList();

    static {
        C64768p pVar = new C64768p();
        f175564b = pVar;
        C62942bv.registerDefaultInstance(C64768p.class, pVar);
    }

    private C64768p() {
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
                return newMessageInfo(f175564b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C64761i.class});
            case 3:
                return new C64768p();
            case 4:
                return new C64757e();
            case 5:
                return f175564b;
            case 6:
                C63010eb ebVar = f175565c;
                if (ebVar == null) {
                    synchronized (C64768p.class) {
                        ebVar = f175565c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175564b);
                            f175565c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
