package com.google.android.apps.search.podcasts.episode;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.episode.r */
/* compiled from: PG */
public final class C140239r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140239r f380984c;

    /* renamed from: d */
    private static volatile C63010eb f380985d;

    /* renamed from: a */
    public String f380986a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f380987b = BuildConfig.FLAVOR;

    static {
        C140239r rVar = new C140239r();
        f380984c = rVar;
        C62942bv.registerDefaultInstance(C140239r.class, rVar);
    }

    private C140239r() {
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
                return newMessageInfo(f380984c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C140239r();
            case 4:
                return new C140238q();
            case 5:
                return f380984c;
            case 6:
                C63010eb ebVar = f380985d;
                if (ebVar == null) {
                    synchronized (C140239r.class) {
                        ebVar = f380985d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380984c);
                            f380985d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
