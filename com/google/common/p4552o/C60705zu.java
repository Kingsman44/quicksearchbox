package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zu */
/* compiled from: PG */
public final class C60705zu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60705zu f164708d;

    /* renamed from: e */
    private static volatile C63010eb f164709e;

    /* renamed from: a */
    public int f164710a;

    /* renamed from: b */
    public int f164711b;

    /* renamed from: c */
    public int f164712c;

    static {
        C60705zu zuVar = new C60705zu();
        f164708d = zuVar;
        C62942bv.registerDefaultInstance(C60705zu.class, zuVar);
    }

    private C60705zu() {
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
                return newMessageInfo(f164708d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60705zu();
            case 4:
                return new C60704zt();
            case 5:
                return f164708d;
            case 6:
                C63010eb ebVar = f164709e;
                if (ebVar == null) {
                    synchronized (C60705zu.class) {
                        ebVar = f164709e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164708d);
                            f164709e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
