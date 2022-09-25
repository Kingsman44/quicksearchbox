package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.bg */
/* compiled from: PG */
public final class C48960bg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48960bg f126667d;

    /* renamed from: f */
    private static volatile C63010eb f126668f;

    /* renamed from: a */
    public String f126669a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f126670b;

    /* renamed from: c */
    public C48956bc f126671c;

    /* renamed from: e */
    private int f126672e;

    static {
        C48960bg bgVar = new C48960bg();
        f126667d = bgVar;
        C62942bv.registerDefaultInstance(C48960bg.class, bgVar);
    }

    private C48960bg() {
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
                return newMessageInfo(f126667d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C48958be.f126666a, C45240c.f118157a});
            case 3:
                return new C48960bg();
            case 4:
                return new C48957bd();
            case 5:
                return f126667d;
            case 6:
                C63010eb ebVar = f126668f;
                if (ebVar == null) {
                    synchronized (C48960bg.class) {
                        ebVar = f126668f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126667d);
                            f126668f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
