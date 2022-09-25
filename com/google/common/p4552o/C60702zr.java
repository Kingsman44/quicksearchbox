package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zr */
/* compiled from: PG */
public final class C60702zr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60702zr f164696d;

    /* renamed from: e */
    private static volatile C63010eb f164697e;

    /* renamed from: a */
    public int f164698a;

    /* renamed from: b */
    public int f164699b;

    /* renamed from: c */
    public int f164700c;

    static {
        C60702zr zrVar = new C60702zr();
        f164696d = zrVar;
        C62942bv.registerDefaultInstance(C60702zr.class, zrVar);
    }

    private C60702zr() {
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
                return newMessageInfo(f164696d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60702zr();
            case 4:
                return new C60701zq();
            case 5:
                return f164696d;
            case 6:
                C63010eb ebVar = f164697e;
                if (ebVar == null) {
                    synchronized (C60702zr.class) {
                        ebVar = f164697e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164696d);
                            f164697e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
