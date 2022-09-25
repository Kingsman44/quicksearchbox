package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10310h.C136135p;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ag */
/* compiled from: PG */
public final class C138552ag extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C138552ag f376842f;

    /* renamed from: g */
    private static volatile C63010eb f376843g;

    /* renamed from: a */
    public int f376844a;

    /* renamed from: b */
    public int f376845b;

    /* renamed from: c */
    public boolean f376846c;

    /* renamed from: d */
    public C136135p f376847d;

    /* renamed from: e */
    public String f376848e = BuildConfig.FLAVOR;

    static {
        C138552ag agVar = new C138552ag();
        f376842f = agVar;
        C62942bv.registerDefaultInstance(C138552ag.class, agVar);
    }

    private C138552ag() {
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
                return newMessageInfo(f376842f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C139704d.m227142b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C138552ag();
            case 4:
                return new C138551af();
            case 5:
                return f376842f;
            case 6:
                C63010eb ebVar = f376843g;
                if (ebVar == null) {
                    synchronized (C138552ag.class) {
                        ebVar = f376843g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376842f);
                            f376843g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
