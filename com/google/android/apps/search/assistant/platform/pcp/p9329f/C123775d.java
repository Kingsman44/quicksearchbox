package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.d */
/* compiled from: PG */
public final class C123775d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C123775d f341913h;

    /* renamed from: i */
    private static volatile C63010eb f341914i;

    /* renamed from: a */
    public int f341915a;

    /* renamed from: b */
    public long f341916b;

    /* renamed from: c */
    public String f341917c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f341918d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f341919e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f341920f;

    /* renamed from: g */
    public int f341921g;

    static {
        C123775d dVar = new C123775d();
        f341913h = dVar;
        C62942bv.registerDefaultInstance(C123775d.class, dVar);
    }

    private C123775d() {
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
                return newMessageInfo(f341913h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C123775d();
            case 4:
                return new C123760c();
            case 5:
                return f341913h;
            case 6:
                C63010eb ebVar = f341914i;
                if (ebVar == null) {
                    synchronized (C123775d.class) {
                        ebVar = f341914i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341913h);
                            f341914i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
