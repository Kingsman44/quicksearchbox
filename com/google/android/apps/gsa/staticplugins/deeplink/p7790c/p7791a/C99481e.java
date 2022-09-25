package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.e */
/* compiled from: PG */
public final class C99481e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C99481e f278378e;

    /* renamed from: g */
    private static volatile C63010eb f278379g;

    /* renamed from: a */
    public int f278380a = 0;

    /* renamed from: b */
    public Object f278381b;

    /* renamed from: c */
    public String f278382c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f278383d;

    /* renamed from: f */
    private int f278384f;

    static {
        C99481e eVar = new C99481e();
        f278378e = eVar;
        C62942bv.registerDefaultInstance(C99481e.class, eVar);
    }

    private C99481e() {
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
                return newMessageInfo(f278378e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003င\u0002", new Object[]{"b", "a", C10662f.f35572a, C45240c.f118157a, C99480d.class, "d"});
            case 3:
                return new C99481e();
            case 4:
                return new C99478b();
            case 5:
                return f278378e;
            case 6:
                C63010eb ebVar = f278379g;
                if (ebVar == null) {
                    synchronized (C99481e.class) {
                        ebVar = f278379g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278378e);
                            f278379g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
