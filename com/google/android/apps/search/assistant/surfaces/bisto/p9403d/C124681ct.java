package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.ct */
/* compiled from: PG */
public final class C124681ct extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124681ct f343972c;

    /* renamed from: d */
    private static volatile C63010eb f343973d;

    /* renamed from: a */
    public int f343974a;

    /* renamed from: b */
    public String f343975b = BuildConfig.FLAVOR;

    static {
        C124681ct ctVar = new C124681ct();
        f343972c = ctVar;
        C62942bv.registerDefaultInstance(C124681ct.class, ctVar);
    }

    private C124681ct() {
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
                return newMessageInfo(f343972c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124681ct();
            case 4:
                return new C124680cs();
            case 5:
                return f343972c;
            case 6:
                C63010eb ebVar = f343973d;
                if (ebVar == null) {
                    synchronized (C124681ct.class) {
                        ebVar = f343973d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343972c);
                            f343973d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
