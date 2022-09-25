package com.google.knowledge.p4661a.p4662a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.a.l */
/* compiled from: PG */
public final class C61750l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61750l f166806a;

    /* renamed from: b */
    private static volatile C63010eb f166807b;

    static {
        C61750l lVar = new C61750l();
        f166806a = lVar;
        C62942bv.registerDefaultInstance(C61750l.class, lVar);
    }

    private C61750l() {
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
                return newMessageInfo(f166806a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61750l();
            case 4:
                return new C61749k();
            case 5:
                return f166806a;
            case 6:
                C63010eb ebVar = f166807b;
                if (ebVar == null) {
                    synchronized (C61750l.class) {
                        ebVar = f166807b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166806a);
                            f166807b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
