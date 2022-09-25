package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ow */
/* compiled from: PG */
public final class C60339ow extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60339ow f163320e;

    /* renamed from: f */
    private static volatile C63010eb f163321f;

    /* renamed from: a */
    public int f163322a;

    /* renamed from: b */
    public long f163323b;

    /* renamed from: c */
    public int f163324c;

    /* renamed from: d */
    public int f163325d;

    static {
        C60339ow owVar = new C60339ow();
        f163320e = owVar;
        C62942bv.registerDefaultInstance(C60339ow.class, owVar);
    }

    private C60339ow() {
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
                return newMessageInfo(f163320e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60339ow();
            case 4:
                return new C60338ov();
            case 5:
                return f163320e;
            case 6:
                C63010eb ebVar = f163321f;
                if (ebVar == null) {
                    synchronized (C60339ow.class) {
                        ebVar = f163321f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163320e);
                            f163321f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
