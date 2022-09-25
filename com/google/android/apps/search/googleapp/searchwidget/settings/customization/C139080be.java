package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.be */
/* compiled from: PG */
public final class C139080be extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C139080be f378248g;

    /* renamed from: h */
    private static volatile C63010eb f378249h;

    /* renamed from: a */
    public int f378250a;

    /* renamed from: b */
    public boolean f378251b;

    /* renamed from: c */
    public int f378252c = 230;

    /* renamed from: d */
    public int f378253d = 3;

    /* renamed from: e */
    public int f378254e = 1;

    /* renamed from: f */
    public C139074az f378255f;

    static {
        C139080be beVar = new C139080be();
        f378248g = beVar;
        C62942bv.registerDefaultInstance(C139080be.class, beVar);
    }

    private C139080be() {
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
                return newMessageInfo(f378248g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C139077bb.m225893b(), "e", C139071aw.f378226a, C10662f.f35572a});
            case 3:
                return new C139080be();
            case 4:
                return new C139070av();
            case 5:
                return f378248g;
            case 6:
                C63010eb ebVar = f378249h;
                if (ebVar == null) {
                    synchronized (C139080be.class) {
                        ebVar = f378249h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378248g);
                            f378249h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
