package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.pp */
/* compiled from: PG */
public final class C60421pp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60421pp f163510e;

    /* renamed from: f */
    private static volatile C63010eb f163511f;

    /* renamed from: a */
    public int f163512a;

    /* renamed from: b */
    public long f163513b;

    /* renamed from: c */
    public int f163514c;

    /* renamed from: d */
    public long f163515d;

    static {
        C60421pp ppVar = new C60421pp();
        f163510e = ppVar;
        C62942bv.registerDefaultInstance(C60421pp.class, ppVar);
    }

    private C60421pp() {
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
                return newMessageInfo(f163510e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, C60420po.m92579b(), "d"});
            case 3:
                return new C60421pp();
            case 4:
                return new C60418pm();
            case 5:
                return f163510e;
            case 6:
                C63010eb ebVar = f163511f;
                if (ebVar == null) {
                    synchronized (C60421pp.class) {
                        ebVar = f163511f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163510e);
                            f163511f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
