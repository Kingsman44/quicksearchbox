package com.google.android.apps.gsa.speech.helper.p7281b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.helper.b.d */
/* compiled from: PG */
public final class C92308d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C92308d f257402e;

    /* renamed from: f */
    private static volatile C63010eb f257403f;

    /* renamed from: a */
    public int f257404a;

    /* renamed from: b */
    public String f257405b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f257406c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f257407d;

    static {
        C92308d dVar = new C92308d();
        f257402e = dVar;
        C62942bv.registerDefaultInstance(C92308d.class, dVar);
    }

    private C92308d() {
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
                return newMessageInfo(f257402e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C92306b.f257401a});
            case 3:
                return new C92308d();
            case 4:
                return new C92305a();
            case 5:
                return f257402e;
            case 6:
                C63010eb ebVar = f257403f;
                if (ebVar == null) {
                    synchronized (C92308d.class) {
                        ebVar = f257403f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257402e);
                            f257403f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
