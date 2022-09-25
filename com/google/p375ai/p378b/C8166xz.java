package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xz */
/* compiled from: PG */
public final class C8166xz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8166xz f28696e;

    /* renamed from: f */
    private static volatile C63010eb f28697f;

    /* renamed from: a */
    public int f28698a;

    /* renamed from: b */
    public C8135wv f28699b;

    /* renamed from: c */
    public C7929pe f28700c;

    /* renamed from: d */
    public C7924p f28701d;

    static {
        C8166xz xzVar = new C8166xz();
        f28696e = xzVar;
        C62942bv.registerDefaultInstance(C8166xz.class, xzVar);
    }

    private C8166xz() {
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
                return newMessageInfo(f28696e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8166xz();
            case 4:
                return new C8165xy();
            case 5:
                return f28696e;
            case 6:
                C63010eb ebVar = f28697f;
                if (ebVar == null) {
                    synchronized (C8166xz.class) {
                        ebVar = f28697f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28696e);
                            f28697f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
