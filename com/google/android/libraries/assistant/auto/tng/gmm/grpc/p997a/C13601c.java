package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.c */
/* compiled from: PG */
public final class C13601c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13601c f41627e;

    /* renamed from: f */
    private static volatile C63010eb f41628f;

    /* renamed from: a */
    public int f41629a;

    /* renamed from: b */
    public int f41630b;

    /* renamed from: c */
    public int f41631c;

    /* renamed from: d */
    public long f41632d;

    static {
        C13601c cVar = new C13601c();
        f41627e = cVar;
        C62942bv.registerDefaultInstance(C13601c.class, cVar);
    }

    private C13601c() {
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
                return newMessageInfo(f41627e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C13588a.f41599a, C45240c.f118157a, "d"});
            case 3:
                return new C13601c();
            case 4:
                return new C13600b();
            case 5:
                return f41627e;
            case 6:
                C63010eb ebVar = f41628f;
                if (ebVar == null) {
                    synchronized (C13601c.class) {
                        ebVar = f41628f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41627e);
                            f41628f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
