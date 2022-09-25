package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.ad */
/* compiled from: PG */
public final class C78670ad extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C78670ad f216577h;

    /* renamed from: i */
    private static volatile C63010eb f216578i;

    /* renamed from: a */
    public String f216579a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f216580b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f216581c;

    /* renamed from: d */
    public String f216582d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f216583e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C83320io f216584f;

    /* renamed from: g */
    public boolean f216585g;

    static {
        C78670ad adVar = new C78670ad();
        f216577h = adVar;
        C62942bv.registerDefaultInstance(C78670ad.class, adVar);
    }

    private C78670ad() {
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
                return newMessageInfo(f216577h, "\u0000\u0007\u0000\u0000\u0002\b\u0007\u0000\u0000\u0000\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005Ȉ\u0006\t\u0007\u0007\bȈ", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "b"});
            case 3:
                return new C78670ad();
            case 4:
                return new C78669ac();
            case 5:
                return f216577h;
            case 6:
                C63010eb ebVar = f216578i;
                if (ebVar == null) {
                    synchronized (C78670ad.class) {
                        ebVar = f216578i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216577h);
                            f216578i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
