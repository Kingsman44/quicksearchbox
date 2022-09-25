package com.google.android.apps.gsa.search.core.p6819q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.q.d */
/* compiled from: PG */
public final class C86351d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C86351d f233463g;

    /* renamed from: h */
    private static volatile C63010eb f233464h;

    /* renamed from: a */
    public int f233465a;

    /* renamed from: b */
    public C63088z f233466b = C63088z.f170246b;

    /* renamed from: c */
    public String f233467c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f233468d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f233469e;

    /* renamed from: f */
    public C63088z f233470f = C63088z.f170246b;

    static {
        C86351d dVar = new C86351d();
        f233463g = dVar;
        C62942bv.registerDefaultInstance(C86351d.class, dVar);
    }

    private C86351d() {
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
                return newMessageInfo(f233463g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ည\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C86351d();
            case 4:
                return new C86350c();
            case 5:
                return f233463g;
            case 6:
                C63010eb ebVar = f233464h;
                if (ebVar == null) {
                    synchronized (C86351d.class) {
                        ebVar = f233464h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f233463g);
                            f233464h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
