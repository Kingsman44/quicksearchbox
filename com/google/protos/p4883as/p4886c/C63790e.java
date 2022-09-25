package com.google.protos.p4883as.p4886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.c.e */
/* compiled from: PG */
public final class C63790e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63790e f172550a;

    /* renamed from: c */
    private static volatile C63010eb f172551c;

    /* renamed from: b */
    private C62995dn f172552b = C62995dn.f170057a;

    static {
        C63790e eVar = new C63790e();
        f172550a = eVar;
        C62942bv.registerDefaultInstance(C63790e.class, eVar);
    }

    private C63790e() {
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
                return newMessageInfo(f172550a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", C63787b.f172547a});
            case 3:
                return new C63790e();
            case 4:
                return new C63786a();
            case 5:
                return f172550a;
            case 6:
                C63010eb ebVar = f172551c;
                if (ebVar == null) {
                    synchronized (C63790e.class) {
                        ebVar = f172551c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172550a);
                            f172551c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
