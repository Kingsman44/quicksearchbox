package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.bn */
/* compiled from: PG */
public final class C63927bn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63927bn f172872b;

    /* renamed from: d */
    private static volatile C63010eb f172873d;

    /* renamed from: a */
    public int f172874a;

    /* renamed from: c */
    private int f172875c;

    static {
        C63927bn bnVar = new C63927bn();
        f172872b = bnVar;
        C62942bv.registerDefaultInstance(C63927bn.class, bnVar);
    }

    private C63927bn() {
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
                return newMessageInfo(f172872b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C63926bm.m96319b()});
            case 3:
                return new C63927bn();
            case 4:
                return new C63924bk();
            case 5:
                return f172872b;
            case 6:
                C63010eb ebVar = f172873d;
                if (ebVar == null) {
                    synchronized (C63927bn.class) {
                        ebVar = f172873d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172872b);
                            f172873d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
