package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w */
/* compiled from: PG */
public final class C134891w extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C134891w f367215e;

    /* renamed from: f */
    private static volatile C63010eb f367216f;

    /* renamed from: a */
    public int f367217a;

    /* renamed from: b */
    public String f367218b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f367219c;

    /* renamed from: d */
    public String f367220d = BuildConfig.FLAVOR;

    static {
        C134891w wVar = new C134891w();
        f367215e = wVar;
        C62942bv.registerDefaultInstance(C134891w.class, wVar);
    }

    private C134891w() {
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
                return newMessageInfo(f367215e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C134891w();
            case 4:
                return new C134890v();
            case 5:
                return f367215e;
            case 6:
                C63010eb ebVar = f367216f;
                if (ebVar == null) {
                    synchronized (C134891w.class) {
                        ebVar = f367216f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367215e);
                            f367216f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
