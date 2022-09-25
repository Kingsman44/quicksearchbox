package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.cx */
/* compiled from: PG */
public final class C124685cx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124685cx f343980d;

    /* renamed from: f */
    private static volatile C63010eb f343981f;

    /* renamed from: a */
    public String f343982a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f343983b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f343984c;

    /* renamed from: e */
    private int f343985e;

    static {
        C124685cx cxVar = new C124685cx();
        f343980d = cxVar;
        C62942bv.registerDefaultInstance(C124685cx.class, cxVar);
    }

    private C124685cx() {
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
                return newMessageInfo(f343980d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C124685cx();
            case 4:
                return new C124684cw();
            case 5:
                return f343980d;
            case 6:
                C63010eb ebVar = f343981f;
                if (ebVar == null) {
                    synchronized (C124685cx.class) {
                        ebVar = f343981f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343980d);
                            f343981f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
