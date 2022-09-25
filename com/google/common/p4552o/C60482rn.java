package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.rn */
/* compiled from: PG */
public final class C60482rn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60482rn f163688e;

    /* renamed from: f */
    private static volatile C63010eb f163689f;

    /* renamed from: a */
    public int f163690a;

    /* renamed from: b */
    public int f163691b;

    /* renamed from: c */
    public int f163692c;

    /* renamed from: d */
    public int f163693d;

    static {
        C60482rn rnVar = new C60482rn();
        f163688e = rnVar;
        C62942bv.registerDefaultInstance(C60482rn.class, rnVar);
    }

    private C60482rn() {
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
                return newMessageInfo(f163688e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C60481rm.f163687a});
            case 3:
                return new C60482rn();
            case 4:
                return new C60480rl();
            case 5:
                return f163688e;
            case 6:
                C63010eb ebVar = f163689f;
                if (ebVar == null) {
                    synchronized (C60482rn.class) {
                        ebVar = f163689f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163688e);
                            f163689f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
