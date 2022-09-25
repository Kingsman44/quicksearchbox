package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4253e.p4254a.C56182b;
import com.google.p4242bp.p4253e.p4254a.C56192l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ra */
/* compiled from: PG */
public final class C88151ra extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C88151ra f238286g;

    /* renamed from: h */
    private static volatile C63010eb f238287h;

    /* renamed from: a */
    public int f238288a;

    /* renamed from: b */
    public String f238289b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238290c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f238291d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56192l f238292e;

    /* renamed from: f */
    public C56182b f238293f;

    static {
        C88151ra raVar = new C88151ra();
        f238286g = raVar;
        C62942bv.registerDefaultInstance(C88151ra.class, raVar);
    }

    private C88151ra() {
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
                return newMessageInfo(f238286g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C88151ra();
            case 4:
                return new C88149qz();
            case 5:
                return f238286g;
            case 6:
                C63010eb ebVar = f238287h;
                if (ebVar == null) {
                    synchronized (C88151ra.class) {
                        ebVar = f238287h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238286g);
                            f238287h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
