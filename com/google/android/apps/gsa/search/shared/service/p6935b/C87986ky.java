package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ky */
/* compiled from: PG */
public final class C87986ky extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87986ky f237947d;

    /* renamed from: e */
    private static volatile C63010eb f237948e;

    /* renamed from: a */
    public int f237949a;

    /* renamed from: b */
    public int f237950b;

    /* renamed from: c */
    public String f237951c = BuildConfig.FLAVOR;

    static {
        C87986ky kyVar = new C87986ky();
        f237947d = kyVar;
        C62942bv.registerDefaultInstance(C87986ky.class, kyVar);
    }

    private C87986ky() {
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
                return newMessageInfo(f237947d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87986ky();
            case 4:
                return new C87985kx();
            case 5:
                return f237947d;
            case 6:
                C63010eb ebVar = f237948e;
                if (ebVar == null) {
                    synchronized (C87986ky.class) {
                        ebVar = f237948e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237947d);
                            f237948e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
