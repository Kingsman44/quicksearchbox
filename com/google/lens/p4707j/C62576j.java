package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.lens.j.j */
/* compiled from: PG */
public final class C62576j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62576j f168937e;

    /* renamed from: f */
    private static volatile C63010eb f168938f;

    /* renamed from: a */
    public C62586t f168939a;

    /* renamed from: b */
    public C63088z f168940b = C63088z.f170246b;

    /* renamed from: c */
    public int f168941c;

    /* renamed from: d */
    public boolean f168942d;

    static {
        C62576j jVar = new C62576j();
        f168937e = jVar;
        C62942bv.registerDefaultInstance(C62576j.class, jVar);
    }

    private C62576j() {
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
                return newMessageInfo(f168937e, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\n\u0003\t\u0004\f\u0005\u0007", new Object[]{"b", "a", C45240c.f118157a, "d"});
            case 3:
                return new C62576j();
            case 4:
                return new C62574h();
            case 5:
                return f168937e;
            case 6:
                C63010eb ebVar = f168938f;
                if (ebVar == null) {
                    synchronized (C62576j.class) {
                        ebVar = f168938f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168937e);
                            f168938f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
