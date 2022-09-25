package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.cq */
/* compiled from: PG */
public final class C67714cq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67714cq f183717d;

    /* renamed from: e */
    private static volatile C63010eb f183718e;

    /* renamed from: a */
    public int f183719a;

    /* renamed from: b */
    public int f183720b;

    /* renamed from: c */
    public int f183721c;

    static {
        C67714cq cqVar = new C67714cq();
        f183717d = cqVar;
        C62942bv.registerDefaultInstance(C67714cq.class, cqVar);
    }

    private C67714cq() {
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
                return newMessageInfo(f183717d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67714cq();
            case 4:
                return new C67713cp();
            case 5:
                return f183717d;
            case 6:
                C63010eb ebVar = f183718e;
                if (ebVar == null) {
                    synchronized (C67714cq.class) {
                        ebVar = f183718e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183717d);
                            f183718e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
