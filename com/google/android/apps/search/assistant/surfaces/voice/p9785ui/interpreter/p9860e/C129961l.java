package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.l */
/* compiled from: PG */
public final class C129961l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C129961l f356436e;

    /* renamed from: f */
    private static volatile C63010eb f356437f;

    /* renamed from: a */
    public int f356438a;

    /* renamed from: b */
    public String f356439b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f356440c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f356441d;

    static {
        C129961l lVar = new C129961l();
        f356436e = lVar;
        C62942bv.registerDefaultInstance(C129961l.class, lVar);
    }

    private C129961l() {
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
                return newMessageInfo(f356436e, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003ለ\u0000\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C129961l();
            case 4:
                return new C129960k();
            case 5:
                return f356436e;
            case 6:
                C63010eb ebVar = f356437f;
                if (ebVar == null) {
                    synchronized (C129961l.class) {
                        ebVar = f356437f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356436e);
                            f356437f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
