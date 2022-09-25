package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.am */
/* compiled from: PG */
public final class C8470am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8470am f29407b;

    /* renamed from: c */
    private static volatile C63010eb f29408c;

    /* renamed from: a */
    public C62971cq f29409a = emptyProtobufList();

    static {
        C8470am amVar = new C8470am();
        f29407b = amVar;
        C62942bv.registerDefaultInstance(C8470am.class, amVar);
    }

    private C8470am() {
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
                return newMessageInfo(f29407b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C8460ac.class});
            case 3:
                return new C8470am();
            case 4:
                return new C8469al();
            case 5:
                return f29407b;
            case 6:
                C63010eb ebVar = f29408c;
                if (ebVar == null) {
                    synchronized (C8470am.class) {
                        ebVar = f29408c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29407b);
                            f29408c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
