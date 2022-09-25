package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fp */
/* compiled from: PG */
public final class C59788fp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59788fp f161549d;

    /* renamed from: e */
    private static volatile C63010eb f161550e;

    /* renamed from: a */
    public int f161551a;

    /* renamed from: b */
    public C59753ej f161552b;

    /* renamed from: c */
    public int f161553c;

    static {
        C59788fp fpVar = new C59788fp();
        f161549d = fpVar;
        C62942bv.registerDefaultInstance(C59788fp.class, fpVar);
    }

    private C59788fp() {
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
                return newMessageInfo(f161549d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59788fp();
            case 4:
                return new C59787fo();
            case 5:
                return f161549d;
            case 6:
                C63010eb ebVar = f161550e;
                if (ebVar == null) {
                    synchronized (C59788fp.class) {
                        ebVar = f161550e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161549d);
                            f161550e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
