package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.df */
/* compiled from: PG */
public final class C59536df extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59536df f157979e;

    /* renamed from: f */
    private static volatile C63010eb f157980f;

    /* renamed from: a */
    public int f157981a;

    /* renamed from: b */
    public int f157982b = 0;

    /* renamed from: c */
    public Object f157983c;

    /* renamed from: d */
    public long f157984d;

    static {
        C59536df dfVar = new C59536df();
        f157979e = dfVar;
        C62942bv.registerDefaultInstance(C59536df.class, dfVar);
    }

    private C59536df() {
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
                return newMessageInfo(f157979e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0003ျ\u0000\u0004ဂ\u0002", new Object[]{C45240c.f118157a, "b", "a", C59535de.f157978a, "d"});
            case 3:
                return new C59536df();
            case 4:
                return new C59534dd();
            case 5:
                return f157979e;
            case 6:
                C63010eb ebVar = f157980f;
                if (ebVar == null) {
                    synchronized (C59536df.class) {
                        ebVar = f157980f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157979e);
                            f157980f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
