package com.google.common.p4552o.p4570p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.bb */
/* compiled from: PG */
public final class C60373bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60373bb f163395b;

    /* renamed from: d */
    private static volatile C63010eb f163396d;

    /* renamed from: a */
    public int f163397a;

    /* renamed from: c */
    private int f163398c;

    static {
        C60373bb bbVar = new C60373bb();
        f163395b = bbVar;
        C62942bv.registerDefaultInstance(C60373bb.class, bbVar);
    }

    private C60373bb() {
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
                return newMessageInfo(f163395b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C60370az.f163394a});
            case 3:
                return new C60373bb();
            case 4:
                return new C60369ay();
            case 5:
                return f163395b;
            case 6:
                C63010eb ebVar = f163396d;
                if (ebVar == null) {
                    synchronized (C60373bb.class) {
                        ebVar = f163396d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163395b);
                            f163396d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
