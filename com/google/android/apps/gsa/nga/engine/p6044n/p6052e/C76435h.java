package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.h */
/* compiled from: PG */
public final class C76435h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C76435h f211585e;

    /* renamed from: g */
    private static volatile C63010eb f211586g;

    /* renamed from: a */
    public int f211587a = 0;

    /* renamed from: b */
    public Object f211588b;

    /* renamed from: c */
    public String f211589c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f211590d;

    /* renamed from: f */
    private int f211591f;

    static {
        C76435h hVar = new C76435h();
        f211585e = hVar;
        C62942bv.registerDefaultInstance(C76435h.class, hVar);
    }

    private C76435h() {
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
                return newMessageInfo(f211585e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002်\u0000\u0003ျ\u0000\u0004ဇ\u0003", new Object[]{"b", "a", C10662f.f35572a, C45240c.f118157a, "d"});
            case 3:
                return new C76435h();
            case 4:
                return new C76434g();
            case 5:
                return f211585e;
            case 6:
                C63010eb ebVar = f211586g;
                if (ebVar == null) {
                    synchronized (C76435h.class) {
                        ebVar = f211586g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211585e);
                            f211586g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
