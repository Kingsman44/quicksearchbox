package com.google.android.apps.gsa.search.core.p6519al.p6694dd;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p11016ak.C147716e;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.l */
/* compiled from: PG */
public final class C85343l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C85343l f231127h;

    /* renamed from: i */
    private static volatile C63010eb f231128i;

    /* renamed from: a */
    public int f231129a;

    /* renamed from: b */
    public C119103al f231130b;

    /* renamed from: c */
    public int f231131c;

    /* renamed from: d */
    public String f231132d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f231133e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C68189by f231134f;

    /* renamed from: g */
    public int f231135g;

    static {
        C85343l lVar = new C85343l();
        f231127h = lVar;
        C62942bv.registerDefaultInstance(C85343l.class, lVar);
    }

    private C85343l() {
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
                return newMessageInfo(f231127h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C147716e.f398617a});
            case 3:
                return new C85343l();
            case 4:
                return new C85342k();
            case 5:
                return f231127h;
            case 6:
                C63010eb ebVar = f231128i;
                if (ebVar == null) {
                    synchronized (C85343l.class) {
                        ebVar = f231128i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231127h);
                            f231128i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
