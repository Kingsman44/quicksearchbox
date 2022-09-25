package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.nh */
/* compiled from: PG */
public final class C60295nh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60295nh f163127d;

    /* renamed from: e */
    private static volatile C63010eb f163128e;

    /* renamed from: a */
    public int f163129a;

    /* renamed from: b */
    public int f163130b;

    /* renamed from: c */
    public boolean f163131c;

    static {
        C60295nh nhVar = new C60295nh();
        f163127d = nhVar;
        C62942bv.registerDefaultInstance(C60295nh.class, nhVar);
    }

    private C60295nh() {
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
                return newMessageInfo(f163127d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C60294ng.f163126a, C45240c.f118157a});
            case 3:
                return new C60295nh();
            case 4:
                return new C60293nf();
            case 5:
                return f163127d;
            case 6:
                C63010eb ebVar = f163128e;
                if (ebVar == null) {
                    synchronized (C60295nh.class) {
                        ebVar = f163128e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163127d);
                            f163128e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
