package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.a.d */
/* compiled from: PG */
public final class C129300d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129300d f355128d;

    /* renamed from: e */
    private static volatile C63010eb f355129e;

    /* renamed from: a */
    public String f355130a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f355131b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f355132c;

    static {
        C129300d dVar = new C129300d();
        f355128d = dVar;
        C62942bv.registerDefaultInstance(C129300d.class, dVar);
    }

    private C129300d() {
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
                return newMessageInfo(f355128d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C129300d();
            case 4:
                return new C129298b();
            case 5:
                return f355128d;
            case 6:
                C63010eb ebVar = f355129e;
                if (ebVar == null) {
                    synchronized (C129300d.class) {
                        ebVar = f355129e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355128d);
                            f355129e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
