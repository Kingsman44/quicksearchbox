package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.h */
/* compiled from: PG */
public final class C25269h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C25269h f68742d;

    /* renamed from: e */
    private static volatile C63010eb f68743e;

    /* renamed from: a */
    public long f68744a;

    /* renamed from: b */
    public int f68745b;

    /* renamed from: c */
    public boolean f68746c;

    static {
        C25269h hVar = new C25269h();
        f68742d = hVar;
        C62942bv.registerDefaultInstance(C25269h.class, hVar);
    }

    private C25269h() {
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
                return newMessageInfo(f68742d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C25269h();
            case 4:
                return new C25268g();
            case 5:
                return f68742d;
            case 6:
                C63010eb ebVar = f68743e;
                if (ebVar == null) {
                    synchronized (C25269h.class) {
                        ebVar = f68743e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68742d);
                            f68743e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
