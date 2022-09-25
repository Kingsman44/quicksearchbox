package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.dj */
/* compiled from: PG */
public final class C59725dj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59725dj f160305d;

    /* renamed from: e */
    private static volatile C63010eb f160306e;

    /* renamed from: a */
    public int f160307a;

    /* renamed from: b */
    public int f160308b;

    /* renamed from: c */
    public boolean f160309c;

    static {
        C59725dj djVar = new C59725dj();
        f160305d = djVar;
        C62942bv.registerDefaultInstance(C59725dj.class, djVar);
    }

    private C59725dj() {
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
                return newMessageInfo(f160305d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C59724di.f160304a, C45240c.f118157a});
            case 3:
                return new C59725dj();
            case 4:
                return new C59723dh();
            case 5:
                return f160305d;
            case 6:
                C63010eb ebVar = f160306e;
                if (ebVar == null) {
                    synchronized (C59725dj.class) {
                        ebVar = f160306e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160305d);
                            f160306e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
