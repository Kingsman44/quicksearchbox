package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.co */
/* compiled from: PG */
public final class C60177co extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60177co f162780f;

    /* renamed from: g */
    private static volatile C63010eb f162781g;

    /* renamed from: a */
    public int f162782a;

    /* renamed from: b */
    public long f162783b;

    /* renamed from: c */
    public long f162784c;

    /* renamed from: d */
    public long f162785d;

    /* renamed from: e */
    public long f162786e;

    static {
        C60177co coVar = new C60177co();
        f162780f = coVar;
        C62942bv.registerDefaultInstance(C60177co.class, coVar);
    }

    private C60177co() {
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
                return newMessageInfo(f162780f, "\u0001\u0004\u0000\u0001\u0003\b\u0004\u0000\u0000\u0000\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\bဃ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C60177co();
            case 4:
                return new C60176cn();
            case 5:
                return f162780f;
            case 6:
                C63010eb ebVar = f162781g;
                if (ebVar == null) {
                    synchronized (C60177co.class) {
                        ebVar = f162781g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162780f);
                            f162781g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
