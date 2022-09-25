package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.h.at */
/* compiled from: PG */
public final class C66563at extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66563at f181054f;

    /* renamed from: g */
    private static volatile C63010eb f181055g;

    /* renamed from: a */
    public int f181056a;

    /* renamed from: b */
    public String f181057b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f181058c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f181059d = C63088z.f170246b;

    /* renamed from: e */
    public int f181060e;

    static {
        C66563at atVar = new C66563at();
        f181054f = atVar;
        C62942bv.registerDefaultInstance(C66563at.class, atVar);
    }

    private C66563at() {
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
                return newMessageInfo(f181054f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0003\u0004ည\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C66562as.f181053a, "d"});
            case 3:
                return new C66563at();
            case 4:
                return new C66561ar();
            case 5:
                return f181054f;
            case 6:
                C63010eb ebVar = f181055g;
                if (ebVar == null) {
                    synchronized (C66563at.class) {
                        ebVar = f181055g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181054f);
                            f181055g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
