package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.av */
/* compiled from: PG */
public final class C60026av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60026av f162244a;

    /* renamed from: e */
    private static volatile C63010eb f162245e;

    /* renamed from: b */
    private int f162246b;

    /* renamed from: c */
    private C60033h f162247c;

    /* renamed from: d */
    private byte f162248d = 2;

    static {
        C60026av avVar = new C60026av();
        f162244a = avVar;
        C62942bv.registerDefaultInstance(C60026av.class, avVar);
    }

    private C60026av() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162248d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162248d = b;
                return null;
            case 2:
                return newMessageInfo(f162244a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60026av();
            case 4:
                return new C60025au();
            case 5:
                return f162244a;
            case 6:
                C63010eb ebVar = f162245e;
                if (ebVar == null) {
                    synchronized (C60026av.class) {
                        ebVar = f162245e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162244a);
                            f162245e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
