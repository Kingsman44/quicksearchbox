package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.au */
/* compiled from: PG */
public final class C119601au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119601au f333338d;

    /* renamed from: e */
    private static volatile C63010eb f333339e;

    /* renamed from: a */
    public int f333340a;

    /* renamed from: b */
    public C119638t f333341b;

    /* renamed from: c */
    public C119644z f333342c;

    static {
        C119601au auVar = new C119601au();
        f333338d = auVar;
        C62942bv.registerDefaultInstance(C119601au.class, auVar);
    }

    private C119601au() {
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
                return newMessageInfo(f333338d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119601au();
            case 4:
                return new C119600at();
            case 5:
                return f333338d;
            case 6:
                C63010eb ebVar = f333339e;
                if (ebVar == null) {
                    synchronized (C119601au.class) {
                        ebVar = f333339e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333338d);
                            f333339e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
