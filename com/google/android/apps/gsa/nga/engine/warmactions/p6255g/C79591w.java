package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.w */
/* compiled from: PG */
public final class C79591w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79591w f218372d;

    /* renamed from: e */
    private static volatile C63010eb f218373e;

    /* renamed from: a */
    public int f218374a;

    /* renamed from: b */
    public String f218375b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f218376c;

    static {
        C79591w wVar = new C79591w();
        f218372d = wVar;
        C62942bv.registerDefaultInstance(C79591w.class, wVar);
    }

    private C79591w() {
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
                return newMessageInfo(f218372d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C79591w();
            case 4:
                return new C79590v();
            case 5:
                return f218372d;
            case 6:
                C63010eb ebVar = f218373e;
                if (ebVar == null) {
                    synchronized (C79591w.class) {
                        ebVar = f218373e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218372d);
                            f218373e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
