package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ms */
/* compiled from: PG */
public final class C88034ms extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88034ms f238052d;

    /* renamed from: e */
    private static volatile C63010eb f238053e;

    /* renamed from: a */
    public int f238054a;

    /* renamed from: b */
    public String f238055b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238056c = BuildConfig.FLAVOR;

    static {
        C88034ms msVar = new C88034ms();
        f238052d = msVar;
        C62942bv.registerDefaultInstance(C88034ms.class, msVar);
    }

    private C88034ms() {
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
                return newMessageInfo(f238052d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88034ms();
            case 4:
                return new C88033mr();
            case 5:
                return f238052d;
            case 6:
                C63010eb ebVar = f238053e;
                if (ebVar == null) {
                    synchronized (C88034ms.class) {
                        ebVar = f238053e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238052d);
                            f238053e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
