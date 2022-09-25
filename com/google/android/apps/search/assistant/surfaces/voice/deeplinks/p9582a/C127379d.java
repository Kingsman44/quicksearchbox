package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.d */
/* compiled from: PG */
public final class C127379d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C127379d f350760d;

    /* renamed from: e */
    private static volatile C63010eb f350761e;

    /* renamed from: a */
    public int f350762a;

    /* renamed from: b */
    public String f350763b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f350764c = BuildConfig.FLAVOR;

    static {
        C127379d dVar = new C127379d();
        f350760d = dVar;
        C62942bv.registerDefaultInstance(C127379d.class, dVar);
    }

    private C127379d() {
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
                return newMessageInfo(f350760d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127379d();
            case 4:
                return new C127378c();
            case 5:
                return f350760d;
            case 6:
                C63010eb ebVar = f350761e;
                if (ebVar == null) {
                    synchronized (C127379d.class) {
                        ebVar = f350761e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350760d);
                            f350761e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
