package com.google.android.apps.search.webglide.p10699b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.webglide.b.p */
/* compiled from: PG */
public final class C142185p extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C142185p f385723l;

    /* renamed from: m */
    private static volatile C63010eb f385724m;

    /* renamed from: a */
    public int f385725a;

    /* renamed from: b */
    public String f385726b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f385727c = 1;

    /* renamed from: d */
    public String f385728d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f385729e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f385730f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f385731g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f385732h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f385733i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62995dn f385734j = C62995dn.f170057a;

    /* renamed from: k */
    public int f385735k;

    static {
        C142185p pVar = new C142185p();
        f385723l = pVar;
        C62942bv.registerDefaultInstance(C142185p.class, pVar);
    }

    private C142185p() {
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
                return newMessageInfo(f385723l, "\u0001\n\u0000\u0001\u0001\n\n\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t2\nင\b", new Object[]{"a", "b", C45240c.f118157a, C142183n.f385722a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C142182m.f385721a, C19621k.f54601a});
            case 3:
                return new C142185p();
            case 4:
                return new C142181l();
            case 5:
                return f385723l;
            case 6:
                C63010eb ebVar = f385724m;
                if (ebVar == null) {
                    synchronized (C142185p.class) {
                        ebVar = f385724m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385723l);
                            f385724m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
