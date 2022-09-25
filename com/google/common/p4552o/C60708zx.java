package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.common.o.zx */
/* compiled from: PG */
public final class C60708zx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60708zx f164713d;

    /* renamed from: e */
    private static volatile C63010eb f164714e;

    /* renamed from: a */
    public int f164715a;

    /* renamed from: b */
    public C63088z f164716b = C63088z.f170246b;

    /* renamed from: c */
    public int f164717c;

    static {
        C60708zx zxVar = new C60708zx();
        f164713d = zxVar;
        C62942bv.registerDefaultInstance(C60708zx.class, zxVar);
    }

    private C60708zx() {
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
                return newMessageInfo(f164713d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60708zx();
            case 4:
                return new C60707zw();
            case 5:
                return f164713d;
            case 6:
                C63010eb ebVar = f164714e;
                if (ebVar == null) {
                    synchronized (C60708zx.class) {
                        ebVar = f164714e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164713d);
                            f164714e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
