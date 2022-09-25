package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.b */
/* compiled from: PG */
public final class C138192b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C138192b f375998b;

    /* renamed from: d */
    private static volatile C63010eb f375999d;

    /* renamed from: a */
    public String f376000a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f376001c;

    static {
        C138192b bVar = new C138192b();
        f375998b = bVar;
        C62942bv.registerDefaultInstance(C138192b.class, bVar);
    }

    private C138192b() {
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
                return newMessageInfo(f375998b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C138192b();
            case 4:
                return new C138152a();
            case 5:
                return f375998b;
            case 6:
                C63010eb ebVar = f375999d;
                if (ebVar == null) {
                    synchronized (C138192b.class) {
                        ebVar = f375999d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375998b);
                            f375999d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
