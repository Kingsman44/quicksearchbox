package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.profile.a.b.a.aw */
/* compiled from: PG */
public final class C44010aw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C44010aw f114562d;

    /* renamed from: e */
    private static volatile C63010eb f114563e;

    /* renamed from: a */
    public int f114564a;

    /* renamed from: b */
    public long f114565b;

    /* renamed from: c */
    public int f114566c;

    static {
        C44010aw awVar = new C44010aw();
        f114562d = awVar;
        C62942bv.registerDefaultInstance(C44010aw.class, awVar);
    }

    private C44010aw() {
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
                return newMessageInfo(f114562d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C44009av.m77694b()});
            case 3:
                return new C44010aw();
            case 4:
                return new C44007at();
            case 5:
                return f114562d;
            case 6:
                C63010eb ebVar = f114563e;
                if (ebVar == null) {
                    synchronized (C44010aw.class) {
                        ebVar = f114563e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f114562d);
                            f114563e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
