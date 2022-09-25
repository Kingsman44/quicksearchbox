package com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.c.f */
/* compiled from: PG */
public final class C107275f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C107275f f298582d;

    /* renamed from: e */
    private static volatile C63010eb f298583e;

    /* renamed from: a */
    public int f298584a;

    /* renamed from: b */
    public String f298585b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f298586c;

    static {
        C107275f fVar = new C107275f();
        f298582d = fVar;
        C62942bv.registerDefaultInstance(C107275f.class, fVar);
    }

    private C107275f() {
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
                return newMessageInfo(f298582d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C107275f();
            case 4:
                return new C107274e();
            case 5:
                return f298582d;
            case 6:
                C63010eb ebVar = f298583e;
                if (ebVar == null) {
                    synchronized (C107275f.class) {
                        ebVar = f298583e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f298582d);
                            f298583e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
