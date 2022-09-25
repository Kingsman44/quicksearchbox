package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.dq */
/* compiled from: PG */
public final class C142392dq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142392dq f386392b;

    /* renamed from: d */
    private static volatile C63010eb f386393d;

    /* renamed from: a */
    public int f386394a;

    /* renamed from: c */
    private int f386395c;

    static {
        C142392dq dqVar = new C142392dq();
        f386392b = dqVar;
        C62942bv.registerDefaultInstance(C142392dq.class, dqVar);
    }

    private C142392dq() {
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
                return newMessageInfo(f386392b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C142390do.m231075b()});
            case 3:
                return new C142392dq();
            case 4:
                return new C142391dp();
            case 5:
                return f386392b;
            case 6:
                C63010eb ebVar = f386393d;
                if (ebVar == null) {
                    synchronized (C142392dq.class) {
                        ebVar = f386393d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386392b);
                            f386393d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
