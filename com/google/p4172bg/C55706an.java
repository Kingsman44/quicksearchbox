package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.an */
/* compiled from: PG */
public final class C55706an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55706an f146955d;

    /* renamed from: e */
    private static volatile C63010eb f146956e;

    /* renamed from: a */
    public String f146957a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f146958b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f146959c = BuildConfig.FLAVOR;

    static {
        C55706an anVar = new C55706an();
        f146955d = anVar;
        C62942bv.registerDefaultInstance(C55706an.class, anVar);
    }

    private C55706an() {
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
                return newMessageInfo(f146955d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55706an();
            case 4:
                return new C55705am();
            case 5:
                return f146955d;
            case 6:
                C63010eb ebVar = f146956e;
                if (ebVar == null) {
                    synchronized (C55706an.class) {
                        ebVar = f146956e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146955d);
                            f146956e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
