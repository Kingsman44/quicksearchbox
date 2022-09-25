package com.google.protos.p4946az;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.az.k */
/* compiled from: PG */
public final class C64363k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64363k f173962d;

    /* renamed from: e */
    private static volatile C63010eb f173963e;

    /* renamed from: a */
    public int f173964a;

    /* renamed from: b */
    public String f173965b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f173966c;

    static {
        C64363k kVar = new C64363k();
        f173962d = kVar;
        C62942bv.registerDefaultInstance(C64363k.class, kVar);
    }

    private C64363k() {
        emptyProtobufList();
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
                return newMessageInfo(f173962d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C64361i.f173961a});
            case 3:
                return new C64363k();
            case 4:
                return new C64360h();
            case 5:
                return f173962d;
            case 6:
                C63010eb ebVar = f173963e;
                if (ebVar == null) {
                    synchronized (C64363k.class) {
                        ebVar = f173963e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173962d);
                            f173963e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
