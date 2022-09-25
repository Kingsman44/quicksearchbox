package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.dy */
/* compiled from: PG */
public final class C142400dy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142400dy f386405d;

    /* renamed from: e */
    private static volatile C63010eb f386406e;

    /* renamed from: a */
    public int f386407a;

    /* renamed from: b */
    public int f386408b;

    /* renamed from: c */
    public int f386409c;

    static {
        C142400dy dyVar = new C142400dy();
        f386405d = dyVar;
        C62942bv.registerDefaultInstance(C142400dy.class, dyVar);
    }

    private C142400dy() {
        emptyProtobufList();
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
                return newMessageInfo(f386405d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", C142404eb.f386412a, C45240c.f118157a});
            case 3:
                return new C142400dy();
            case 4:
                return new C142399dx();
            case 5:
                return f386405d;
            case 6:
                C63010eb ebVar = f386406e;
                if (ebVar == null) {
                    synchronized (C142400dy.class) {
                        ebVar = f386406e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386405d);
                            f386406e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
