package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.libraries.search.assistant.p2704m.C34807b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.t */
/* compiled from: PG */
public final class C119638t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119638t f333402e;

    /* renamed from: f */
    private static volatile C63010eb f333403f;

    /* renamed from: a */
    public int f333404a;

    /* renamed from: b */
    public int f333405b;

    /* renamed from: c */
    public boolean f333406c;

    /* renamed from: d */
    public int f333407d;

    static {
        C119638t tVar = new C119638t();
        f333402e = tVar;
        C62942bv.registerDefaultInstance(C119638t.class, tVar);
    }

    private C119638t() {
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
                return newMessageInfo(f333402e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C119637s.f333401a, C45240c.f118157a, "d", C34807b.m63567b()});
            case 3:
                return new C119638t();
            case 4:
                return new C119636r();
            case 5:
                return f333402e;
            case 6:
                C63010eb ebVar = f333403f;
                if (ebVar == null) {
                    synchronized (C119638t.class) {
                        ebVar = f333403f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333402e);
                            f333403f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
