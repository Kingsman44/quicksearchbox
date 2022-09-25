package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.t */
/* compiled from: PG */
public final class C57189t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57189t f152674d;

    /* renamed from: f */
    private static volatile C63010eb f152675f;

    /* renamed from: a */
    public boolean f152676a;

    /* renamed from: b */
    public boolean f152677b;

    /* renamed from: c */
    public boolean f152678c;

    /* renamed from: e */
    private int f152679e;

    static {
        C57189t tVar = new C57189t();
        f152674d = tVar;
        C62942bv.registerDefaultInstance(C57189t.class, tVar);
    }

    private C57189t() {
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
                return newMessageInfo(f152674d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C57189t();
            case 4:
                return new C57188s();
            case 5:
                return f152674d;
            case 6:
                C63010eb ebVar = f152675f;
                if (ebVar == null) {
                    synchronized (C57189t.class) {
                        ebVar = f152675f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152674d);
                            f152675f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
