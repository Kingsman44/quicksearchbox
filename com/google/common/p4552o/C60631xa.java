package com.google.common.p4552o;

import com.google.android.apps.gsa.p8852u.C118571d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xa */
/* compiled from: PG */
public final class C60631xa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60631xa f164492d;

    /* renamed from: e */
    private static volatile C63010eb f164493e;

    /* renamed from: a */
    public int f164494a;

    /* renamed from: b */
    public int f164495b;

    /* renamed from: c */
    public boolean f164496c;

    static {
        C60631xa xaVar = new C60631xa();
        f164492d = xaVar;
        C62942bv.registerDefaultInstance(C60631xa.class, xaVar);
    }

    private C60631xa() {
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
                return newMessageInfo(f164492d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C118571d.m196863b(), C45240c.f118157a});
            case 3:
                return new C60631xa();
            case 4:
                return new C60629wz();
            case 5:
                return f164492d;
            case 6:
                C63010eb ebVar = f164493e;
                if (ebVar == null) {
                    synchronized (C60631xa.class) {
                        ebVar = f164493e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164492d);
                            f164493e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
