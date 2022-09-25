package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jw */
/* compiled from: PG */
public final class C53329jw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53329jw f139834a;

    /* renamed from: b */
    private static volatile C63010eb f139835b;

    static {
        C53329jw jwVar = new C53329jw();
        f139834a = jwVar;
        C62942bv.registerDefaultInstance(C53329jw.class, jwVar);
    }

    private C53329jw() {
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
                return newMessageInfo(f139834a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53329jw();
            case 4:
                return new C53328jv();
            case 5:
                return f139834a;
            case 6:
                C63010eb ebVar = f139835b;
                if (ebVar == null) {
                    synchronized (C53329jw.class) {
                        ebVar = f139835b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139834a);
                            f139835b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
