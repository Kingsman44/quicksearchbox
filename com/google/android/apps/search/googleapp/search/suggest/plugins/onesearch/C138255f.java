package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.f */
/* compiled from: PG */
public final class C138255f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C138255f f376152b;

    /* renamed from: d */
    private static volatile C63010eb f376153d;

    /* renamed from: a */
    public String f376154a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f376155c;

    static {
        C138255f fVar = new C138255f();
        f376152b = fVar;
        C62942bv.registerDefaultInstance(C138255f.class, fVar);
    }

    private C138255f() {
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
                return newMessageInfo(f376152b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C138255f();
            case 4:
                return new C138254e();
            case 5:
                return f376152b;
            case 6:
                C63010eb ebVar = f376153d;
                if (ebVar == null) {
                    synchronized (C138255f.class) {
                        ebVar = f376153d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376152b);
                            f376153d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
