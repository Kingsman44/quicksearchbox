package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ou */
/* compiled from: PG */
public final class C60337ou extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60337ou f163314e;

    /* renamed from: f */
    private static volatile C63010eb f163315f;

    /* renamed from: a */
    public int f163316a;

    /* renamed from: b */
    public long f163317b;

    /* renamed from: c */
    public int f163318c;

    /* renamed from: d */
    public int f163319d;

    static {
        C60337ou ouVar = new C60337ou();
        f163314e = ouVar;
        C62942bv.registerDefaultInstance(C60337ou.class, ouVar);
    }

    private C60337ou() {
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
                return newMessageInfo(f163314e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60337ou();
            case 4:
                return new C60336ot();
            case 5:
                return f163314e;
            case 6:
                C63010eb ebVar = f163315f;
                if (ebVar == null) {
                    synchronized (C60337ou.class) {
                        ebVar = f163315f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163314e);
                            f163315f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
