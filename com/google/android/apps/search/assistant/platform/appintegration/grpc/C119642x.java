package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.x */
/* compiled from: PG */
public final class C119642x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119642x f333419e;

    /* renamed from: f */
    private static volatile C63010eb f333420f;

    /* renamed from: a */
    public int f333421a;

    /* renamed from: b */
    public String f333422b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f333423c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f333424d;

    static {
        C119642x xVar = new C119642x();
        f333419e = xVar;
        C62942bv.registerDefaultInstance(C119642x.class, xVar);
    }

    private C119642x() {
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
                return newMessageInfo(f333419e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C119642x();
            case 4:
                return new C119641w();
            case 5:
                return f333419e;
            case 6:
                C63010eb ebVar = f333420f;
                if (ebVar == null) {
                    synchronized (C119642x.class) {
                        ebVar = f333420f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333419e);
                            f333420f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
