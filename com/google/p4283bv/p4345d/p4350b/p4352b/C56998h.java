package com.google.p4283bv.p4345d.p4350b.p4352b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.b.h */
/* compiled from: PG */
public final class C56998h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56998h f152149d;

    /* renamed from: f */
    private static volatile C63010eb f152150f;

    /* renamed from: a */
    public int f152151a;

    /* renamed from: b */
    public int f152152b;

    /* renamed from: c */
    public double f152153c;

    /* renamed from: e */
    private int f152154e;

    static {
        C56998h hVar = new C56998h();
        f152149d = hVar;
        C62942bv.registerDefaultInstance(C56998h.class, hVar);
    }

    private C56998h() {
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
                return newMessageInfo(f152149d, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0000\u0000\u0004င\u0000\u0005င\u0001\u0007က\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C56998h();
            case 4:
                return new C56997g();
            case 5:
                return f152149d;
            case 6:
                C63010eb ebVar = f152150f;
                if (ebVar == null) {
                    synchronized (C56998h.class) {
                        ebVar = f152150f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152149d);
                            f152150f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
