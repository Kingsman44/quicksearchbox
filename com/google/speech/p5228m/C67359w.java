package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.m.w */
/* compiled from: PG */
public final class C67359w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67359w f183087d;

    /* renamed from: f */
    private static volatile C63010eb f183088f;

    /* renamed from: a */
    public C67361y f183089a;

    /* renamed from: b */
    public int f183090b;

    /* renamed from: c */
    public C63088z f183091c = C63088z.f170246b;

    /* renamed from: e */
    private int f183092e;

    static {
        C67359w wVar = new C67359w();
        f183087d = wVar;
        C62942bv.registerDefaultInstance(C67359w.class, wVar);
    }

    private C67359w() {
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
                return newMessageInfo(f183087d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002\u0004ည\u0003", new Object[]{"e", "a", "b", C67277ah.f182881a, C45240c.f118157a});
            case 3:
                return new C67359w();
            case 4:
                return new C67358v();
            case 5:
                return f183087d;
            case 6:
                C63010eb ebVar = f183088f;
                if (ebVar == null) {
                    synchronized (C67359w.class) {
                        ebVar = f183088f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183087d);
                            f183088f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
