package com.google.speech.p5208h.p5209a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.h.a.f */
/* compiled from: PG */
public final class C66535f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66535f f180953e;

    /* renamed from: g */
    private static volatile C63010eb f180954g;

    /* renamed from: a */
    public String f180955a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f180956b = C63088z.f170246b;

    /* renamed from: c */
    public long f180957c;

    /* renamed from: d */
    public int f180958d;

    /* renamed from: f */
    private int f180959f;

    static {
        C66535f fVar = new C66535f();
        f180953e = fVar;
        C62942bv.registerDefaultInstance(C66535f.class, fVar);
    }

    private C66535f() {
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
                return newMessageInfo(f180953e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66535f();
            case 4:
                return new C66534e();
            case 5:
                return f180953e;
            case 6:
                C63010eb ebVar = f180954g;
                if (ebVar == null) {
                    synchronized (C66535f.class) {
                        ebVar = f180954g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180953e);
                            f180954g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
