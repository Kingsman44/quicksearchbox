package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.h */
/* compiled from: PG */
public final class C139008h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C139008h f378043h;

    /* renamed from: i */
    private static volatile C63010eb f378044i;

    /* renamed from: a */
    public int f378045a;

    /* renamed from: b */
    public String f378046b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f378047c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f378048d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f378049e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f378050f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C139002b f378051g;

    static {
        C139008h hVar = new C139008h();
        f378043h = hVar;
        C62942bv.registerDefaultInstance(C139008h.class, hVar);
    }

    private C139008h() {
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
                return newMessageInfo(f378043h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C139008h();
            case 4:
                return new C139007g();
            case 5:
                return f378043h;
            case 6:
                C63010eb ebVar = f378044i;
                if (ebVar == null) {
                    synchronized (C139008h.class) {
                        ebVar = f378044i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378043h);
                            f378044i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
