package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xc */
/* compiled from: PG */
public final class C60633xc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60633xc f164497f;

    /* renamed from: g */
    private static volatile C63010eb f164498g;

    /* renamed from: a */
    public int f164499a;

    /* renamed from: b */
    public int f164500b = 1;

    /* renamed from: c */
    public int f164501c;

    /* renamed from: d */
    public int f164502d;

    /* renamed from: e */
    public int f164503e;

    static {
        C60633xc xcVar = new C60633xc();
        f164497f = xcVar;
        C62942bv.registerDefaultInstance(C60633xc.class, xcVar);
    }

    private C60633xc() {
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
                return newMessageInfo(f164497f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C60634xd.f164504a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C60633xc();
            case 4:
                return new C60632xb();
            case 5:
                return f164497f;
            case 6:
                C63010eb ebVar = f164498g;
                if (ebVar == null) {
                    synchronized (C60633xc.class) {
                        ebVar = f164498g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164497f);
                            f164498g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
