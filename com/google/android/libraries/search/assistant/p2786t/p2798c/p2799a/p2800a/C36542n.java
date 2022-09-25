package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.n */
/* compiled from: PG */
public final class C36542n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C36542n f95319e;

    /* renamed from: f */
    private static volatile C63010eb f95320f;

    /* renamed from: a */
    public int f95321a;

    /* renamed from: b */
    public int f95322b = 0;

    /* renamed from: c */
    public Object f95323c;

    /* renamed from: d */
    public boolean f95324d;

    static {
        C36542n nVar = new C36542n();
        f95319e = nVar;
        C62942bv.registerDefaultInstance(C36542n.class, nVar);
    }

    private C36542n() {
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
                return newMessageInfo(f95319e, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဇ\u0000", new Object[]{C45240c.f118157a, "b", "a", C36541m.class, C36550v.class, "d"});
            case 3:
                return new C36542n();
            case 4:
                return new C36539k();
            case 5:
                return f95319e;
            case 6:
                C63010eb ebVar = f95320f;
                if (ebVar == null) {
                    synchronized (C36542n.class) {
                        ebVar = f95320f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95319e);
                            f95320f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
