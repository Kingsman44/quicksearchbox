package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.ao */
/* compiled from: PG */
public final class C67284ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67284ao f182896d;

    /* renamed from: f */
    private static volatile C63010eb f182897f;

    /* renamed from: a */
    public String f182898a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f182899b;

    /* renamed from: c */
    public C67302bf f182900c;

    /* renamed from: e */
    private int f182901e;

    static {
        C67284ao aoVar = new C67284ao();
        f182896d = aoVar;
        C62942bv.registerDefaultInstance(C67284ao.class, aoVar);
    }

    private C67284ao() {
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
                return newMessageInfo(f182896d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0003\u0004င\u0001", new Object[]{"e", "a", C45240c.f118157a, "b"});
            case 3:
                return new C67284ao();
            case 4:
                return new C67283an();
            case 5:
                return f182896d;
            case 6:
                C63010eb ebVar = f182897f;
                if (ebVar == null) {
                    synchronized (C67284ao.class) {
                        ebVar = f182897f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182896d);
                            f182897f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
