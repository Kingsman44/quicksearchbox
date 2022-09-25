package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.x */
/* compiled from: PG */
public final class C24469x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24469x f66975d;

    /* renamed from: e */
    private static volatile C63010eb f66976e;

    /* renamed from: a */
    public int f66977a;

    /* renamed from: b */
    public C24465t f66978b;

    /* renamed from: c */
    public int f66979c;

    static {
        C24469x xVar = new C24469x();
        f66975d = xVar;
        C62942bv.registerDefaultInstance(C24469x.class, xVar);
    }

    private C24469x() {
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
                return newMessageInfo(f66975d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C24452g.f66945a});
            case 3:
                return new C24469x();
            case 4:
                return new C24468w();
            case 5:
                return f66975d;
            case 6:
                C63010eb ebVar = f66976e;
                if (ebVar == null) {
                    synchronized (C24469x.class) {
                        ebVar = f66976e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66975d);
                            f66976e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
