package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hr */
/* compiled from: PG */
public final class C51135hr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51135hr f133103b;

    /* renamed from: c */
    private static volatile C63010eb f133104c;

    /* renamed from: a */
    public boolean f133105a;

    static {
        C51135hr hrVar = new C51135hr();
        f133103b = hrVar;
        C62942bv.registerDefaultInstance(C51135hr.class, hrVar);
    }

    private C51135hr() {
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
                return newMessageInfo(f133103b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C51135hr();
            case 4:
                return new C51134hq();
            case 5:
                return f133103b;
            case 6:
                C63010eb ebVar = f133104c;
                if (ebVar == null) {
                    synchronized (C51135hr.class) {
                        ebVar = f133104c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133103b);
                            f133104c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
