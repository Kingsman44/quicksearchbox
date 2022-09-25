package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.eh */
/* compiled from: PG */
public final class C113397eh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C113397eh f314000f;

    /* renamed from: g */
    private static volatile C63010eb f314001g;

    /* renamed from: a */
    public int f314002a;

    /* renamed from: b */
    public C113391eb f314003b;

    /* renamed from: c */
    public C113385dz f314004c;

    /* renamed from: d */
    public C113399ej f314005d;

    /* renamed from: e */
    public C113393ed f314006e;

    static {
        C113397eh ehVar = new C113397eh();
        f314000f = ehVar;
        C62942bv.registerDefaultInstance(C113397eh.class, ehVar);
    }

    private C113397eh() {
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
                return newMessageInfo(f314000f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C113397eh();
            case 4:
                return new C113396eg();
            case 5:
                return f314000f;
            case 6:
                C63010eb ebVar = f314001g;
                if (ebVar == null) {
                    synchronized (C113397eh.class) {
                        ebVar = f314001g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f314000f);
                            f314001g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
