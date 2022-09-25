package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.j */
/* compiled from: PG */
public final class C64141j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64141j f173419e;

    /* renamed from: f */
    private static volatile C63010eb f173420f;

    /* renamed from: a */
    public int f173421a;

    /* renamed from: b */
    public String f173422b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f173423c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f173424d = BuildConfig.FLAVOR;

    static {
        C64141j jVar = new C64141j();
        f173419e = jVar;
        C62942bv.registerDefaultInstance(C64141j.class, jVar);
    }

    private C64141j() {
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
                return newMessageInfo(f173419e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64141j();
            case 4:
                return new C64140i();
            case 5:
                return f173419e;
            case 6:
                C63010eb ebVar = f173420f;
                if (ebVar == null) {
                    synchronized (C64141j.class) {
                        ebVar = f173420f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173419e);
                            f173420f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
