package com.google.p4283bv.p4354e.p4355a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.a.h */
/* compiled from: PG */
public final class C57050h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57050h f152300d;

    /* renamed from: e */
    private static volatile C63010eb f152301e;

    /* renamed from: a */
    public int f152302a;

    /* renamed from: b */
    public int f152303b;

    /* renamed from: c */
    public int f152304c;

    static {
        C57050h hVar = new C57050h();
        f152300d = hVar;
        C62942bv.registerDefaultInstance(C57050h.class, hVar);
    }

    private C57050h() {
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
                return newMessageInfo(f152300d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C8142xb.m22955b()});
            case 3:
                return new C57050h();
            case 4:
                return new C57049g();
            case 5:
                return f152300d;
            case 6:
                C63010eb ebVar = f152301e;
                if (ebVar == null) {
                    synchronized (C57050h.class) {
                        ebVar = f152301e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152300d);
                            f152301e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
