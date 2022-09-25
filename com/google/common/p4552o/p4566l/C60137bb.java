package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bb */
/* compiled from: PG */
public final class C60137bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60137bb f162674d;

    /* renamed from: e */
    private static volatile C63010eb f162675e;

    /* renamed from: a */
    public int f162676a;

    /* renamed from: b */
    public int f162677b;

    /* renamed from: c */
    public C60126ar f162678c;

    static {
        C60137bb bbVar = new C60137bb();
        f162674d = bbVar;
        C62942bv.registerDefaultInstance(C60137bb.class, bbVar);
    }

    private C60137bb() {
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
                return newMessageInfo(f162674d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C60183cu.f162811a, C45240c.f118157a});
            case 3:
                return new C60137bb();
            case 4:
                return new C60136ba();
            case 5:
                return f162674d;
            case 6:
                C63010eb ebVar = f162675e;
                if (ebVar == null) {
                    synchronized (C60137bb.class) {
                        ebVar = f162675e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162674d);
                            f162675e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
