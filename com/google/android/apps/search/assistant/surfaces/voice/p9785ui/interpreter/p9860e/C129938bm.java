package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bm */
/* compiled from: PG */
public final class C129938bm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129938bm f356402d;

    /* renamed from: e */
    private static volatile C63010eb f356403e;

    /* renamed from: a */
    public int f356404a;

    /* renamed from: b */
    public String f356405b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f356406c = BuildConfig.FLAVOR;

    static {
        C129938bm bmVar = new C129938bm();
        f356402d = bmVar;
        C62942bv.registerDefaultInstance(C129938bm.class, bmVar);
    }

    private C129938bm() {
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
                return newMessageInfo(f356402d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C129938bm();
            case 4:
                return new C129937bl();
            case 5:
                return f356402d;
            case 6:
                C63010eb ebVar = f356403e;
                if (ebVar == null) {
                    synchronized (C129938bm.class) {
                        ebVar = f356403e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356402d);
                            f356403e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
