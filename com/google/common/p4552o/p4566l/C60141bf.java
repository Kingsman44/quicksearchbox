package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bf */
/* compiled from: PG */
public final class C60141bf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60141bf f162684f;

    /* renamed from: g */
    private static volatile C63010eb f162685g;

    /* renamed from: a */
    public int f162686a;

    /* renamed from: b */
    public int f162687b;

    /* renamed from: c */
    public long f162688c;

    /* renamed from: d */
    public long f162689d;

    /* renamed from: e */
    public int f162690e;

    static {
        C60141bf bfVar = new C60141bf();
        f162684f = bfVar;
        C62942bv.registerDefaultInstance(C60141bf.class, bfVar);
    }

    private C60141bf() {
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
                return newMessageInfo(f162684f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", C60187cy.f162814a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C60141bf();
            case 4:
                return new C60140be();
            case 5:
                return f162684f;
            case 6:
                C63010eb ebVar = f162685g;
                if (ebVar == null) {
                    synchronized (C60141bf.class) {
                        ebVar = f162685g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162684f);
                            f162685g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
