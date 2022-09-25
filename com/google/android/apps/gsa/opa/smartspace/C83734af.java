package com.google.android.apps.gsa.opa.smartspace;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.af */
/* compiled from: PG */
public final class C83734af extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83734af f228216e;

    /* renamed from: f */
    private static volatile C63010eb f228217f;

    /* renamed from: a */
    public int f228218a;

    /* renamed from: b */
    public String f228219b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f228220c;

    /* renamed from: d */
    public boolean f228221d;

    static {
        C83734af afVar = new C83734af();
        f228216e = afVar;
        C62942bv.registerDefaultInstance(C83734af.class, afVar);
    }

    private C83734af() {
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
                return newMessageInfo(f228216e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C83732ad.f228215a, "d"});
            case 3:
                return new C83734af();
            case 4:
                return new C83731ac();
            case 5:
                return f228216e;
            case 6:
                C63010eb ebVar = f228217f;
                if (ebVar == null) {
                    synchronized (C83734af.class) {
                        ebVar = f228217f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228216e);
                            f228217f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
