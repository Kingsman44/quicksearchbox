package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.ao */
/* compiled from: PG */
public final class C60019ao extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60019ao f162222e;

    /* renamed from: f */
    private static volatile C63010eb f162223f;

    /* renamed from: a */
    public int f162224a;

    /* renamed from: b */
    public int f162225b;

    /* renamed from: c */
    public int f162226c;

    /* renamed from: d */
    public C60021aq f162227d;

    static {
        C60019ao aoVar = new C60019ao();
        f162222e = aoVar;
        C62942bv.registerDefaultInstance(C60019ao.class, aoVar);
    }

    private C60019ao() {
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
                return newMessageInfo(f162222e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C60018an.f162221a, C45240c.f118157a, "d"});
            case 3:
                return new C60019ao();
            case 4:
                return new C60017am();
            case 5:
                return f162222e;
            case 6:
                C63010eb ebVar = f162223f;
                if (ebVar == null) {
                    synchronized (C60019ao.class) {
                        ebVar = f162223f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162222e);
                            f162223f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
