package com.google.protos.p4850an.p4854c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.h */
/* compiled from: PG */
public final class C63419h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63419h f171392d;

    /* renamed from: e */
    private static volatile C63010eb f171393e;

    /* renamed from: a */
    public int f171394a;

    /* renamed from: b */
    public boolean f171395b;

    /* renamed from: c */
    public int f171396c = 1;

    static {
        C63419h hVar = new C63419h();
        f171392d = hVar;
        C62942bv.registerDefaultInstance(C63419h.class, hVar);
    }

    private C63419h() {
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
                return newMessageInfo(f171392d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C63420i.f171397a});
            case 3:
                return new C63419h();
            case 4:
                return new C63418g();
            case 5:
                return f171392d;
            case 6:
                C63010eb ebVar = f171393e;
                if (ebVar == null) {
                    synchronized (C63419h.class) {
                        ebVar = f171393e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171392d);
                            f171393e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
