package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.h */
/* compiled from: PG */
public final class C132800h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C132800h f362331e;

    /* renamed from: f */
    private static volatile C63010eb f362332f;

    /* renamed from: a */
    public int f362333a;

    /* renamed from: b */
    public String f362334b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C132798f f362335c;

    /* renamed from: d */
    public C132818z f362336d;

    static {
        C132800h hVar = new C132800h();
        f362331e = hVar;
        C62942bv.registerDefaultInstance(C132800h.class, hVar);
    }

    private C132800h() {
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
                return newMessageInfo(f362331e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C132800h();
            case 4:
                return new C132799g();
            case 5:
                return f362331e;
            case 6:
                C63010eb ebVar = f362332f;
                if (ebVar == null) {
                    synchronized (C132800h.class) {
                        ebVar = f362332f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362331e);
                            f362332f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
