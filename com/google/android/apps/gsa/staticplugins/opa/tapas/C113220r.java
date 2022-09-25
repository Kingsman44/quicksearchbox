package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r */
/* compiled from: PG */
public final class C113220r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C113220r f313554c;

    /* renamed from: d */
    private static volatile C63010eb f313555d;

    /* renamed from: a */
    public int f313556a = 0;

    /* renamed from: b */
    public Object f313557b;

    static {
        C113220r rVar = new C113220r();
        f313554c = rVar;
        C62942bv.registerDefaultInstance(C113220r.class, rVar);
    }

    private C113220r() {
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
                return newMessageInfo(f313554c, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C113114q.class, C112719m.class});
            case 3:
                return new C113220r();
            case 4:
                return new C112112k();
            case 5:
                return f313554c;
            case 6:
                C63010eb ebVar = f313555d;
                if (ebVar == null) {
                    synchronized (C113220r.class) {
                        ebVar = f313555d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313554c);
                            f313555d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
