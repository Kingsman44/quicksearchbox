package com.google.android.libraries.social.populous.p3289c.p3293d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.populous.c.d.e */
/* compiled from: PG */
public final class C42237e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C42237e f110577d;

    /* renamed from: e */
    private static volatile C63010eb f110578e;

    /* renamed from: a */
    public long f110579a;

    /* renamed from: b */
    public long f110580b;

    /* renamed from: c */
    public long f110581c;

    static {
        C42237e eVar = new C42237e();
        f110577d = eVar;
        C62942bv.registerDefaultInstance(C42237e.class, eVar);
    }

    private C42237e() {
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
                return newMessageInfo(f110577d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C42237e();
            case 4:
                return new C42236d();
            case 5:
                return f110577d;
            case 6:
                C63010eb ebVar = f110578e;
                if (ebVar == null) {
                    synchronized (C42237e.class) {
                        ebVar = f110578e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f110577d);
                            f110578e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
