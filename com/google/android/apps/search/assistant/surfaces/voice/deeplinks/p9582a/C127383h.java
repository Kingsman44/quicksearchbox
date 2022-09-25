package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.h */
/* compiled from: PG */
public final class C127383h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C127383h f350769e;

    /* renamed from: f */
    private static volatile C63010eb f350770f;

    /* renamed from: a */
    public int f350771a;

    /* renamed from: b */
    public String f350772b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f350773c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C38355f f350774d;

    static {
        C127383h hVar = new C127383h();
        f350769e = hVar;
        C62942bv.registerDefaultInstance(C127383h.class, hVar);
    }

    private C127383h() {
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
                return newMessageInfo(f350769e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C127383h();
            case 4:
                return new C127382g();
            case 5:
                return f350769e;
            case 6:
                C63010eb ebVar = f350770f;
                if (ebVar == null) {
                    synchronized (C127383h.class) {
                        ebVar = f350770f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350769e);
                            f350770f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
