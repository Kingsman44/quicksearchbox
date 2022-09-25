package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aky */
/* compiled from: PG */
public final class aky extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aky f158997e;

    /* renamed from: f */
    private static volatile C63010eb f158998f;

    /* renamed from: a */
    public int f158999a;

    /* renamed from: b */
    public int f159000b = 0;

    /* renamed from: c */
    public Object f159001c;

    /* renamed from: d */
    public int f159002d;

    static {
        aky aky = new aky();
        f158997e = aky;
        C62942bv.registerDefaultInstance(aky.class, aky);
    }

    private aky() {
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
                return newMessageInfo(f158997e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003ဿ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", akv.m92426b(), akw.f158996a, akp.m92423b(), akt.class});
            case 3:
                return new aky();
            case 4:
                return new akq();
            case 5:
                return f158997e;
            case 6:
                C63010eb ebVar = f158998f;
                if (ebVar == null) {
                    synchronized (aky.class) {
                        ebVar = f158998f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158997e);
                            f158998f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
