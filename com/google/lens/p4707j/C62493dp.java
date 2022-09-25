package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.dp */
/* compiled from: PG */
public final class C62493dp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62493dp f168716e;

    /* renamed from: f */
    private static volatile C63010eb f168717f;

    /* renamed from: a */
    public int f168718a;

    /* renamed from: b */
    public C62452cb f168719b;

    /* renamed from: c */
    public C62449bz f168720c;

    /* renamed from: d */
    public C62452cb f168721d;

    static {
        C62493dp dpVar = new C62493dp();
        f168716e = dpVar;
        C62942bv.registerDefaultInstance(C62493dp.class, dpVar);
    }

    private C62493dp() {
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
                return newMessageInfo(f168716e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62493dp();
            case 4:
                return new C62492do();
            case 5:
                return f168716e;
            case 6:
                C63010eb ebVar = f168717f;
                if (ebVar == null) {
                    synchronized (C62493dp.class) {
                        ebVar = f168717f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168716e);
                            f168717f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
