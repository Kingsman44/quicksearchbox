package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.cq */
/* compiled from: PG */
public final class C64034cq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64034cq f173142d;

    /* renamed from: e */
    private static volatile C63010eb f173143e;

    /* renamed from: a */
    public int f173144a;

    /* renamed from: b */
    public C64098p f173145b;

    /* renamed from: c */
    public int f173146c;

    static {
        C64034cq cqVar = new C64034cq();
        f173142d = cqVar;
        C62942bv.registerDefaultInstance(C64034cq.class, cqVar);
    }

    private C64034cq() {
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
                return newMessageInfo(f173142d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64034cq();
            case 4:
                return new C64033cp();
            case 5:
                return f173142d;
            case 6:
                C63010eb ebVar = f173143e;
                if (ebVar == null) {
                    synchronized (C64034cq.class) {
                        ebVar = f173143e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173142d);
                            f173143e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
