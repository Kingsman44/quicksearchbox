package com.google.android.apps.gsa.shared.p6990an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.an.m */
/* compiled from: PG */
public final class C89222m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C89222m f241908d;

    /* renamed from: f */
    private static volatile C63010eb f241909f;

    /* renamed from: a */
    public int f241910a;

    /* renamed from: b */
    public long f241911b;

    /* renamed from: c */
    public C62971cq f241912c = emptyProtobufList();

    /* renamed from: e */
    private int f241913e;

    static {
        C89222m mVar = new C89222m();
        f241908d = mVar;
        C62942bv.registerDefaultInstance(C89222m.class, mVar);
    }

    private C89222m() {
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
                return newMessageInfo(f241908d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0004\u001b", new Object[]{"e", "a", C89220k.f241907a, "b", C45240c.f118157a, C89218i.class});
            case 3:
                return new C89222m();
            case 4:
                return new C89219j();
            case 5:
                return f241908d;
            case 6:
                C63010eb ebVar = f241909f;
                if (ebVar == null) {
                    synchronized (C89222m.class) {
                        ebVar = f241909f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241908d);
                            f241909f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
