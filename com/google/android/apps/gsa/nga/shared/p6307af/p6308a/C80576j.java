package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.j */
/* compiled from: PG */
public final class C80576j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80576j f221168d;

    /* renamed from: e */
    private static volatile C63010eb f221169e;

    /* renamed from: a */
    public String f221170a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f221171b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f221172c;

    static {
        C80576j jVar = new C80576j();
        f221168d = jVar;
        C62942bv.registerDefaultInstance(C80576j.class, jVar);
    }

    private C80576j() {
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
                return newMessageInfo(f221168d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80576j();
            case 4:
                return new C80574h();
            case 5:
                return f221168d;
            case 6:
                C63010eb ebVar = f221169e;
                if (ebVar == null) {
                    synchronized (C80576j.class) {
                        ebVar = f221169e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221168d);
                            f221169e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
