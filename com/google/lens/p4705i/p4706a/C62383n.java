package com.google.lens.p4705i.p4706a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.n */
/* compiled from: PG */
public final class C62383n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62383n f168403e;

    /* renamed from: f */
    private static volatile C63010eb f168404f;

    /* renamed from: a */
    public int f168405a;

    /* renamed from: b */
    public boolean f168406b;

    /* renamed from: c */
    public boolean f168407c;

    /* renamed from: d */
    public boolean f168408d;

    static {
        C62383n nVar = new C62383n();
        f168403e = nVar;
        C62942bv.registerDefaultInstance(C62383n.class, nVar);
    }

    private C62383n() {
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
                return newMessageInfo(f168403e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62383n();
            case 4:
                return new C62382m();
            case 5:
                return f168403e;
            case 6:
                C63010eb ebVar = f168404f;
                if (ebVar == null) {
                    synchronized (C62383n.class) {
                        ebVar = f168404f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168403e);
                            f168404f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
