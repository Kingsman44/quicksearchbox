package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
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
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.t */
/* compiled from: PG */
public final class C99496t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C99496t f278416e;

    /* renamed from: f */
    public static final C62940bt f278417f;

    /* renamed from: h */
    private static volatile C63010eb f278418h;

    /* renamed from: a */
    public int f278419a;

    /* renamed from: b */
    public C63088z f278420b = C63088z.f170246b;

    /* renamed from: c */
    public int f278421c;

    /* renamed from: d */
    public int f278422d;

    /* renamed from: g */
    private int f278423g;

    static {
        C99496t tVar = new C99496t();
        f278416e = tVar;
        C62942bv.registerDefaultInstance(C99496t.class, tVar);
        f278417f = C62942bv.newSingularGeneratedExtension(C38348c.f101533a, tVar, tVar, (C62958ce) null, 222400902, C63066gd.MESSAGE, C99496t.class);
    }

    private C99496t() {
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
                return newMessageInfo(f278416e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{C30325g.f82003a, "a", C99494r.f278415a, "b", C45240c.f118157a, "d", C99492p.f278414a});
            case 3:
                return new C99496t();
            case 4:
                return new C99491o();
            case 5:
                return f278416e;
            case 6:
                C63010eb ebVar = f278418h;
                if (ebVar == null) {
                    synchronized (C99496t.class) {
                        ebVar = f278418h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278416e);
                            f278418h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
