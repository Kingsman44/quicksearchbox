package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.d */
/* compiled from: PG */
public final class C128172d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128172d f352593d;

    /* renamed from: e */
    private static volatile C63010eb f352594e;

    /* renamed from: a */
    public int f352595a;

    /* renamed from: b */
    public String f352596b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f352597c;

    static {
        C128172d dVar = new C128172d();
        f352593d = dVar;
        C62942bv.registerDefaultInstance(C128172d.class, dVar);
    }

    private C128172d() {
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
                return newMessageInfo(f352593d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C128172d();
            case 4:
                return new C128171c();
            case 5:
                return f352593d;
            case 6:
                C63010eb ebVar = f352594e;
                if (ebVar == null) {
                    synchronized (C128172d.class) {
                        ebVar = f352594e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352593d);
                            f352594e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
