package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.id */
/* compiled from: PG */
public final class C142514id extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C142514id f386727e;

    /* renamed from: f */
    private static volatile C63010eb f386728f;

    /* renamed from: a */
    public int f386729a;

    /* renamed from: b */
    public int f386730b;

    /* renamed from: c */
    public int f386731c;

    /* renamed from: d */
    public C63088z f386732d = C63088z.f170246b;

    static {
        C142514id idVar = new C142514id();
        f386727e = idVar;
        C62942bv.registerDefaultInstance(C142514id.class, idVar);
    }

    private C142514id() {
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
                return newMessageInfo(f386727e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C142514id();
            case 4:
                return new C142513ic();
            case 5:
                return f386727e;
            case 6:
                C63010eb ebVar = f386728f;
                if (ebVar == null) {
                    synchronized (C142514id.class) {
                        ebVar = f386728f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386727e);
                            f386728f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
