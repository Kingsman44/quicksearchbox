package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.k */
/* compiled from: PG */
public final class C88461k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88461k f239146e;

    /* renamed from: f */
    private static volatile C63010eb f239147f;

    /* renamed from: a */
    public int f239148a;

    /* renamed from: b */
    public String f239149b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f239150c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f239151d = BuildConfig.FLAVOR;

    static {
        C88461k kVar = new C88461k();
        f239146e = kVar;
        C62942bv.registerDefaultInstance(C88461k.class, kVar);
    }

    private C88461k() {
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
                return newMessageInfo(f239146e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88461k();
            case 4:
                return new C88460j();
            case 5:
                return f239146e;
            case 6:
                C63010eb ebVar = f239147f;
                if (ebVar == null) {
                    synchronized (C88461k.class) {
                        ebVar = f239147f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239146e);
                            f239147f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
