package com.google.android.apps.search.sceneviewer;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.sceneviewer.m */
/* compiled from: PG */
public final class C141570m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C141570m f384247e;

    /* renamed from: f */
    private static volatile C63010eb f384248f;

    /* renamed from: a */
    public int f384249a;

    /* renamed from: b */
    public String f384250b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f384251c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f384252d = BuildConfig.FLAVOR;

    static {
        C141570m mVar = new C141570m();
        f384247e = mVar;
        C62942bv.registerDefaultInstance(C141570m.class, mVar);
    }

    private C141570m() {
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
                return newMessageInfo(f384247e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C141570m();
            case 4:
                return new C141569l();
            case 5:
                return f384247e;
            case 6:
                C63010eb ebVar = f384248f;
                if (ebVar == null) {
                    synchronized (C141570m.class) {
                        ebVar = f384248f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384247e);
                            f384248f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
