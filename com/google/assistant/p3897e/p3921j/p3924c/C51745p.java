package com.google.assistant.p3897e.p3921j.p3924c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.p */
/* compiled from: PG */
public final class C51745p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51745p f135755b;

    /* renamed from: c */
    private static volatile C63010eb f135756c;

    /* renamed from: a */
    public C62971cq f135757a = emptyProtobufList();

    static {
        C51745p pVar = new C51745p();
        f135755b = pVar;
        C62942bv.registerDefaultInstance(C51745p.class, pVar);
    }

    private C51745p() {
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
                return newMessageInfo(f135755b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51744o.class});
            case 3:
                return new C51745p();
            case 4:
                return new C51742m();
            case 5:
                return f135755b;
            case 6:
                C63010eb ebVar = f135756c;
                if (ebVar == null) {
                    synchronized (C51745p.class) {
                        ebVar = f135756c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135755b);
                            f135756c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
