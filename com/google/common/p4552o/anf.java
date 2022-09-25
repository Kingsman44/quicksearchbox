package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.anf */
/* compiled from: PG */
public final class anf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final anf f159355f;

    /* renamed from: g */
    private static volatile C63010eb f159356g;

    /* renamed from: a */
    public int f159357a;

    /* renamed from: b */
    public int f159358b = 1;

    /* renamed from: c */
    public int f159359c;

    /* renamed from: d */
    public String f159360d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f159361e;

    static {
        anf anf = new anf();
        f159355f = anf;
        C62942bv.registerDefaultInstance(anf.class, anf);
    }

    private anf() {
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
                return newMessageInfo(f159355f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004င\u0001", new Object[]{"a", "b", ane.m92440b(), "d", "e", C45240c.f118157a});
            case 3:
                return new anf();
            case 4:
                return new anc();
            case 5:
                return f159355f;
            case 6:
                C63010eb ebVar = f159356g;
                if (ebVar == null) {
                    synchronized (anf.class) {
                        ebVar = f159356g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159355f);
                            f159356g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
