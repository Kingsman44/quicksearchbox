package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ap */
/* compiled from: PG */
public final class C63979ap extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63979ap f173026e;

    /* renamed from: f */
    private static volatile C63010eb f173027f;

    /* renamed from: a */
    public int f173028a;

    /* renamed from: b */
    public int f173029b;

    /* renamed from: c */
    public int f173030c;

    /* renamed from: d */
    public int f173031d;

    static {
        C63979ap apVar = new C63979ap();
        f173026e = apVar;
        C62942bv.registerDefaultInstance(C63979ap.class, apVar);
    }

    private C63979ap() {
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
                return newMessageInfo(f173026e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C63978ao.m96330b()});
            case 3:
                return new C63979ap();
            case 4:
                return new C63976am();
            case 5:
                return f173026e;
            case 6:
                C63010eb ebVar = f173027f;
                if (ebVar == null) {
                    synchronized (C63979ap.class) {
                        ebVar = f173027f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173026e);
                            f173027f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
