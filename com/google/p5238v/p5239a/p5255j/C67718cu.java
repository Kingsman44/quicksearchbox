package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.cu */
/* compiled from: PG */
public final class C67718cu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67718cu f183727d;

    /* renamed from: e */
    private static volatile C63010eb f183728e;

    /* renamed from: a */
    public int f183729a;

    /* renamed from: b */
    public C67714cq f183730b;

    /* renamed from: c */
    public C63088z f183731c = C63088z.f170246b;

    static {
        C67718cu cuVar = new C67718cu();
        f183727d = cuVar;
        C62942bv.registerDefaultInstance(C67718cu.class, cuVar);
    }

    private C67718cu() {
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
                return newMessageInfo(f183727d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67718cu();
            case 4:
                return new C67717ct();
            case 5:
                return f183727d;
            case 6:
                C63010eb ebVar = f183728e;
                if (ebVar == null) {
                    synchronized (C67718cu.class) {
                        ebVar = f183728e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183727d);
                            f183728e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
