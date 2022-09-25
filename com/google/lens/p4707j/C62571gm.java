package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.gm */
/* compiled from: PG */
public final class C62571gm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62571gm f168928b;

    /* renamed from: d */
    private static volatile C63010eb f168929d;

    /* renamed from: a */
    public C62554fw f168930a;

    /* renamed from: c */
    private int f168931c;

    static {
        C62571gm gmVar = new C62571gm();
        f168928b = gmVar;
        C62942bv.registerDefaultInstance(C62571gm.class, gmVar);
    }

    private C62571gm() {
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
                return newMessageInfo(f168928b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62571gm();
            case 4:
                return new C62570gl();
            case 5:
                return f168928b;
            case 6:
                C63010eb ebVar = f168929d;
                if (ebVar == null) {
                    synchronized (C62571gm.class) {
                        ebVar = f168929d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168928b);
                            f168929d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
