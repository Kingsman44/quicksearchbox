package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.l */
/* compiled from: PG */
public final class C57181l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57181l f152659e;

    /* renamed from: f */
    private static volatile C63010eb f152660f;

    /* renamed from: a */
    public int f152661a;

    /* renamed from: b */
    public String f152662b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f152663c;

    /* renamed from: d */
    public String f152664d = BuildConfig.FLAVOR;

    static {
        C57181l lVar = new C57181l();
        f152659e = lVar;
        C62942bv.registerDefaultInstance(C57181l.class, lVar);
    }

    private C57181l() {
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
                return newMessageInfo(f152659e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C57179j.f152658a, "d"});
            case 3:
                return new C57181l();
            case 4:
                return new C57178i();
            case 5:
                return f152659e;
            case 6:
                C63010eb ebVar = f152660f;
                if (ebVar == null) {
                    synchronized (C57181l.class) {
                        ebVar = f152660f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152659e);
                            f152660f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
