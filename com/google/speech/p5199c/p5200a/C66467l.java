package com.google.speech.p5199c.p5200a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.c.a.l */
/* compiled from: PG */
public final class C66467l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66467l f180732d;

    /* renamed from: e */
    private static volatile C63010eb f180733e;

    /* renamed from: a */
    public int f180734a;

    /* renamed from: b */
    public String f180735b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f180736c;

    static {
        C66467l lVar = new C66467l();
        f180732d = lVar;
        C62942bv.registerDefaultInstance(C66467l.class, lVar);
    }

    private C66467l() {
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
                return newMessageInfo(f180732d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66467l();
            case 4:
                return new C66466k();
            case 5:
                return f180732d;
            case 6:
                C63010eb ebVar = f180733e;
                if (ebVar == null) {
                    synchronized (C66467l.class) {
                        ebVar = f180733e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180732d);
                            f180733e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
