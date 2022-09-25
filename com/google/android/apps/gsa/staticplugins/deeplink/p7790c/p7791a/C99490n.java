package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.n */
/* compiled from: PG */
public final class C99490n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C99490n f278408d;

    /* renamed from: e */
    public static final C62940bt f278409e;

    /* renamed from: f */
    private static volatile C63010eb f278410f;

    /* renamed from: a */
    public int f278411a;

    /* renamed from: b */
    public int f278412b;

    /* renamed from: c */
    public String f278413c = BuildConfig.FLAVOR;

    static {
        C99490n nVar = new C99490n();
        f278408d = nVar;
        C62942bv.registerDefaultInstance(C99490n.class, nVar);
        f278409e = C62942bv.newSingularGeneratedExtension(C38348c.f101533a, nVar, nVar, (C62958ce) null, 223252856, C63066gd.MESSAGE, C99490n.class);
    }

    private C99490n() {
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
                return newMessageInfo(f278408d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C99488l.m165016b(), C45240c.f118157a});
            case 3:
                return new C99490n();
            case 4:
                return new C99489m();
            case 5:
                return f278408d;
            case 6:
                C63010eb ebVar = f278410f;
                if (ebVar == null) {
                    synchronized (C99490n.class) {
                        ebVar = f278410f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278408d);
                            f278410f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
