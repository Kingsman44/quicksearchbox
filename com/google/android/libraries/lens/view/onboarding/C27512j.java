package com.google.android.libraries.lens.view.onboarding;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.onboarding.j */
/* compiled from: PG */
public final class C27512j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C27512j f75231d;

    /* renamed from: e */
    private static volatile C63010eb f75232e;

    /* renamed from: a */
    public int f75233a;

    /* renamed from: b */
    public boolean f75234b;

    /* renamed from: c */
    public int f75235c;

    static {
        C27512j jVar = new C27512j();
        f75231d = jVar;
        C62942bv.registerDefaultInstance(C27512j.class, jVar);
    }

    private C27512j() {
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
                return newMessageInfo(f75231d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C27512j();
            case 4:
                return new C27511i();
            case 5:
                return f75231d;
            case 6:
                C63010eb ebVar = f75232e;
                if (ebVar == null) {
                    synchronized (C27512j.class) {
                        ebVar = f75232e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f75231d);
                            f75232e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
