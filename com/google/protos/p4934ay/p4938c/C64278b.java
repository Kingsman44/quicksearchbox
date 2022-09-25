package com.google.protos.p4934ay.p4938c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.c.b */
/* compiled from: PG */
public final class C64278b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64278b f173801e;

    /* renamed from: f */
    private static volatile C63010eb f173802f;

    /* renamed from: a */
    public int f173803a;

    /* renamed from: b */
    public int f173804b;

    /* renamed from: c */
    public String f173805c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C64278b f173806d;

    static {
        C64278b bVar = new C64278b();
        f173801e = bVar;
        C62942bv.registerDefaultInstance(C64278b.class, bVar);
    }

    private C64278b() {
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
                return newMessageInfo(f173801e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0001\u0002ဈ\u0002\u0003ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64278b();
            case 4:
                return new C64277a();
            case 5:
                return f173801e;
            case 6:
                C63010eb ebVar = f173802f;
                if (ebVar == null) {
                    synchronized (C64278b.class) {
                        ebVar = f173802f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173801e);
                            f173802f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
