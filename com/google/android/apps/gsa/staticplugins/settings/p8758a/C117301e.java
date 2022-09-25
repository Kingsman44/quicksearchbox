package com.google.android.apps.gsa.staticplugins.settings.p8758a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.a.e */
/* compiled from: PG */
public final class C117301e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C117301e f325624e;

    /* renamed from: f */
    private static volatile C63010eb f325625f;

    /* renamed from: a */
    public int f325626a;

    /* renamed from: b */
    public int f325627b = 0;

    /* renamed from: c */
    public Object f325628c;

    /* renamed from: d */
    public String f325629d = BuildConfig.FLAVOR;

    static {
        C117301e eVar = new C117301e();
        f325624e = eVar;
        C62942bv.registerDefaultInstance(C117301e.class, eVar);
    }

    private C117301e() {
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
                return newMessageInfo(f325624e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003်\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C117301e();
            case 4:
                return new C117300d();
            case 5:
                return f325624e;
            case 6:
                C63010eb ebVar = f325625f;
                if (ebVar == null) {
                    synchronized (C117301e.class) {
                        ebVar = f325625f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f325624e);
                            f325625f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
