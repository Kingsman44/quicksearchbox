package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ad */
/* compiled from: PG */
public final class C111649ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C111649ad f310414d;

    /* renamed from: e */
    private static volatile C63010eb f310415e;

    /* renamed from: a */
    public int f310416a;

    /* renamed from: b */
    public C62971cq f310417b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f310418c = BuildConfig.FLAVOR;

    static {
        C111649ad adVar = new C111649ad();
        f310414d = adVar;
        C62942bv.registerDefaultInstance(C111649ad.class, adVar);
    }

    private C111649ad() {
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
                return newMessageInfo(f310414d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C111649ad();
            case 4:
                return new C111648ac();
            case 5:
                return f310414d;
            case 6:
                C63010eb ebVar = f310415e;
                if (ebVar == null) {
                    synchronized (C111649ad.class) {
                        ebVar = f310415e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f310414d);
                            f310415e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
