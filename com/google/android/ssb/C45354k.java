package com.google.android.ssb;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.ssb.k */
/* compiled from: PG */
public final class C45354k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45354k f118561d;

    /* renamed from: e */
    private static volatile C63010eb f118562e;

    /* renamed from: a */
    public int f118563a;

    /* renamed from: b */
    public String f118564b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f118565c = BuildConfig.FLAVOR;

    static {
        C45354k kVar = new C45354k();
        f118561d = kVar;
        C62942bv.registerDefaultInstance(C45354k.class, kVar);
    }

    private C45354k() {
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
                return newMessageInfo(f118561d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45354k();
            case 4:
                return new C45353j();
            case 5:
                return f118561d;
            case 6:
                C63010eb ebVar = f118562e;
                if (ebVar == null) {
                    synchronized (C45354k.class) {
                        ebVar = f118562e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f118561d);
                            f118562e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
