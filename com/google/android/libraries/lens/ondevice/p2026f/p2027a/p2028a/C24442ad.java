package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.ad */
/* compiled from: PG */
public final class C24442ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24442ad f66925d;

    /* renamed from: e */
    private static volatile C63010eb f66926e;

    /* renamed from: a */
    public int f66927a;

    /* renamed from: b */
    public String f66928b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f66929c = BuildConfig.FLAVOR;

    static {
        C24442ad adVar = new C24442ad();
        f66925d = adVar;
        C62942bv.registerDefaultInstance(C24442ad.class, adVar);
    }

    private C24442ad() {
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
                return newMessageInfo(f66925d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C24442ad();
            case 4:
                return new C24441ac();
            case 5:
                return f66925d;
            case 6:
                C63010eb ebVar = f66926e;
                if (ebVar == null) {
                    synchronized (C24442ad.class) {
                        ebVar = f66926e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66925d);
                            f66926e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
