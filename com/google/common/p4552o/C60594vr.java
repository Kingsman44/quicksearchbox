package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vr */
/* compiled from: PG */
public final class C60594vr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60594vr f164378d;

    /* renamed from: e */
    private static volatile C63010eb f164379e;

    /* renamed from: a */
    public int f164380a;

    /* renamed from: b */
    public boolean f164381b;

    /* renamed from: c */
    public int f164382c;

    static {
        C60594vr vrVar = new C60594vr();
        f164378d = vrVar;
        C62942bv.registerDefaultInstance(C60594vr.class, vrVar);
    }

    private C60594vr() {
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
                return newMessageInfo(f164378d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C60592vp.f164377a});
            case 3:
                return new C60594vr();
            case 4:
                return new C60593vq();
            case 5:
                return f164378d;
            case 6:
                C63010eb ebVar = f164379e;
                if (ebVar == null) {
                    synchronized (C60594vr.class) {
                        ebVar = f164379e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164378d);
                            f164379e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
