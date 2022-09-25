package com.google.common.p4552o;

import com.google.android.p10712d.C142404eb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.nj */
/* compiled from: PG */
public final class C60297nj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60297nj f163132d;

    /* renamed from: e */
    private static volatile C63010eb f163133e;

    /* renamed from: a */
    public int f163134a;

    /* renamed from: b */
    public int f163135b;

    /* renamed from: c */
    public int f163136c;

    static {
        C60297nj njVar = new C60297nj();
        f163132d = njVar;
        C62942bv.registerDefaultInstance(C60297nj.class, njVar);
    }

    private C60297nj() {
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
                return newMessageInfo(f163132d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C142404eb.f386412a, C45240c.f118157a});
            case 3:
                return new C60297nj();
            case 4:
                return new C60296ni();
            case 5:
                return f163132d;
            case 6:
                C63010eb ebVar = f163133e;
                if (ebVar == null) {
                    synchronized (C60297nj.class) {
                        ebVar = f163133e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163132d);
                            f163133e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
