package com.google.common.p4552o.p4554b.p4555a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.ai */
/* compiled from: PG */
public final class C59613ai extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59613ai f159838e;

    /* renamed from: f */
    private static volatile C63010eb f159839f;

    /* renamed from: a */
    public int f159840a;

    /* renamed from: b */
    public long f159841b;

    /* renamed from: c */
    public long f159842c;

    /* renamed from: d */
    public long f159843d;

    static {
        C59613ai aiVar = new C59613ai();
        f159838e = aiVar;
        C62942bv.registerDefaultInstance(C59613ai.class, aiVar);
    }

    private C59613ai() {
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
                return newMessageInfo(f159838e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59613ai();
            case 4:
                return new C59612ah();
            case 5:
                return f159838e;
            case 6:
                C63010eb ebVar = f159839f;
                if (ebVar == null) {
                    synchronized (C59613ai.class) {
                        ebVar = f159839f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159838e);
                            f159839f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
