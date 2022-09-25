package com.google.android.apps.search.sceneviewer;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.sceneviewer.k */
/* compiled from: PG */
public final class C141568k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141568k f384242d;

    /* renamed from: e */
    private static volatile C63010eb f384243e;

    /* renamed from: a */
    public int f384244a;

    /* renamed from: b */
    public String f384245b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f384246c = BuildConfig.FLAVOR;

    static {
        C141568k kVar = new C141568k();
        f384242d = kVar;
        C62942bv.registerDefaultInstance(C141568k.class, kVar);
    }

    private C141568k() {
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
                return newMessageInfo(f384242d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141568k();
            case 4:
                return new C141567j();
            case 5:
                return f384242d;
            case 6:
                C63010eb ebVar = f384243e;
                if (ebVar == null) {
                    synchronized (C141568k.class) {
                        ebVar = f384243e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384242d);
                            f384243e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
