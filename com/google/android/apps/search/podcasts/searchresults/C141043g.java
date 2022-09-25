package com.google.android.apps.search.podcasts.searchresults;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.g */
/* compiled from: PG */
public final class C141043g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C141043g f382903b;

    /* renamed from: c */
    private static volatile C63010eb f382904c;

    /* renamed from: a */
    public String f382905a = BuildConfig.FLAVOR;

    static {
        C141043g gVar = new C141043g();
        f382903b = gVar;
        C62942bv.registerDefaultInstance(C141043g.class, gVar);
    }

    private C141043g() {
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
                return newMessageInfo(f382903b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C141043g();
            case 4:
                return new C141042f();
            case 5:
                return f382903b;
            case 6:
                C63010eb ebVar = f382904c;
                if (ebVar == null) {
                    synchronized (C141043g.class) {
                        ebVar = f382904c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382903b);
                            f382904c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
