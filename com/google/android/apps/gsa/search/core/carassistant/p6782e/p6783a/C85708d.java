package com.google.android.apps.gsa.search.core.carassistant.p6782e.p6783a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.e.a.d */
/* compiled from: PG */
public final class C85708d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C85708d f231759d;

    /* renamed from: h */
    private static volatile C63010eb f231760h;

    /* renamed from: a */
    public boolean f231761a;

    /* renamed from: b */
    public String f231762b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f231763c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f231764e;

    /* renamed from: f */
    private C62995dn f231765f = C62995dn.f170057a;

    /* renamed from: g */
    private C62995dn f231766g = C62995dn.f170057a;

    static {
        C85708d dVar = new C85708d();
        f231759d = dVar;
        C62942bv.registerDefaultInstance(C85708d.class, dVar);
    }

    private C85708d() {
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
                return newMessageInfo(f231759d, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0002\u0000\u0000\u00012\u00022\u0005ဇ\u0002\u0007ဈ\u0004\bဈ\u0005", new Object[]{"e", C10662f.f35572a, C85706b.f231757a, C30325g.f82003a, C85707c.f231758a, "a", "b", C45240c.f118157a});
            case 3:
                return new C85708d();
            case 4:
                return new C85705a();
            case 5:
                return f231759d;
            case 6:
                C63010eb ebVar = f231760h;
                if (ebVar == null) {
                    synchronized (C85708d.class) {
                        ebVar = f231760h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231759d);
                            f231760h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
