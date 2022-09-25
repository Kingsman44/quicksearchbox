package com.google.android.libraries.phenotype.client.p2420a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.phenotype.client.a.f */
/* compiled from: PG */
public final class C31638f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C31638f f85127e;

    /* renamed from: f */
    private static volatile C63010eb f85128f;

    /* renamed from: a */
    public int f85129a;

    /* renamed from: b */
    public int f85130b = 0;

    /* renamed from: c */
    public Object f85131c;

    /* renamed from: d */
    public String f85132d = BuildConfig.FLAVOR;

    static {
        C31638f fVar = new C31638f();
        f85127e = fVar;
        C62942bv.registerDefaultInstance(C31638f.class, fVar);
    }

    private C31638f() {
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
                return newMessageInfo(f85127e, "\u0001\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001း\u0000\u0002်\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0005ွ\u0000\nဈ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C31638f();
            case 4:
                return new C31637e();
            case 5:
                return f85127e;
            case 6:
                C63010eb ebVar = f85128f;
                if (ebVar == null) {
                    synchronized (C31638f.class) {
                        ebVar = f85128f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85127e);
                            f85128f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
