package com.google.android.apps.gsa.shared.p6990an;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.an.p */
/* compiled from: PG */
public final class C89225p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89225p f241917e;

    /* renamed from: f */
    private static volatile C63010eb f241918f;

    /* renamed from: a */
    public int f241919a;

    /* renamed from: b */
    public String f241920b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f241921c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f241922d = BuildConfig.FLAVOR;

    static {
        C89225p pVar = new C89225p();
        f241917e = pVar;
        C62942bv.registerDefaultInstance(C89225p.class, pVar);
    }

    private C89225p() {
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
                return newMessageInfo(f241917e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C89225p();
            case 4:
                return new C89224o();
            case 5:
                return f241917e;
            case 6:
                C63010eb ebVar = f241918f;
                if (ebVar == null) {
                    synchronized (C89225p.class) {
                        ebVar = f241918f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241917e);
                            f241918f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
