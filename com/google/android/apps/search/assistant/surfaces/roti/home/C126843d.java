package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.d */
/* compiled from: PG */
public final class C126843d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C126843d f349320e;

    /* renamed from: f */
    private static volatile C63010eb f349321f;

    /* renamed from: a */
    public int f349322a;

    /* renamed from: b */
    public String f349323b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f349324c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f349325d = BuildConfig.FLAVOR;

    static {
        C126843d dVar = new C126843d();
        f349320e = dVar;
        C62942bv.registerDefaultInstance(C126843d.class, dVar);
    }

    private C126843d() {
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
                return newMessageInfo(f349320e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C126843d();
            case 4:
                return new C126818c();
            case 5:
                return f349320e;
            case 6:
                C63010eb ebVar = f349321f;
                if (ebVar == null) {
                    synchronized (C126843d.class) {
                        ebVar = f349321f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349320e);
                            f349321f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
