package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.an */
/* compiled from: PG */
public final class C125059an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125059an f345031b;

    /* renamed from: c */
    private static volatile C63010eb f345032c;

    /* renamed from: a */
    public String f345033a = BuildConfig.FLAVOR;

    static {
        C125059an anVar = new C125059an();
        f345031b = anVar;
        C62942bv.registerDefaultInstance(C125059an.class, anVar);
    }

    private C125059an() {
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
                return newMessageInfo(f345031b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C125059an();
            case 4:
                return new C125058am();
            case 5:
                return f345031b;
            case 6:
                C63010eb ebVar = f345032c;
                if (ebVar == null) {
                    synchronized (C125059an.class) {
                        ebVar = f345032c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345031b);
                            f345032c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
