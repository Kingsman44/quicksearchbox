package com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.e.b */
/* compiled from: PG */
public final class C92508b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C92508b f258180d;

    /* renamed from: e */
    private static volatile C63010eb f258181e;

    /* renamed from: a */
    public int f258182a;

    /* renamed from: b */
    public C63088z f258183b = C63088z.f170246b;

    /* renamed from: c */
    public String f258184c = BuildConfig.FLAVOR;

    static {
        C92508b bVar = new C92508b();
        f258180d = bVar;
        C62942bv.registerDefaultInstance(C92508b.class, bVar);
    }

    private C92508b() {
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
                return newMessageInfo(f258180d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C92508b();
            case 4:
                return new C92507a();
            case 5:
                return f258180d;
            case 6:
                C63010eb ebVar = f258181e;
                if (ebVar == null) {
                    synchronized (C92508b.class) {
                        ebVar = f258181e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f258180d);
                            f258181e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
