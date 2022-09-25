package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bn */
/* compiled from: PG */
public final class C59490bn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59490bn f157833e;

    /* renamed from: f */
    private static volatile C63010eb f157834f;

    /* renamed from: a */
    public int f157835a;

    /* renamed from: b */
    public String f157836b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f157837c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f157838d = BuildConfig.FLAVOR;

    static {
        C59490bn bnVar = new C59490bn();
        f157833e = bnVar;
        C62942bv.registerDefaultInstance(C59490bn.class, bnVar);
    }

    private C59490bn() {
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
                return newMessageInfo(f157833e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59490bn();
            case 4:
                return new C59489bm();
            case 5:
                return f157833e;
            case 6:
                C63010eb ebVar = f157834f;
                if (ebVar == null) {
                    synchronized (C59490bn.class) {
                        ebVar = f157834f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157833e);
                            f157834f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
