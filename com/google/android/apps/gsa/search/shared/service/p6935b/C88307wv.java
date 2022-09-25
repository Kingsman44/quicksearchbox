package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wv */
/* compiled from: PG */
public final class C88307wv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88307wv f238822e;

    /* renamed from: g */
    private static volatile C63010eb f238823g;

    /* renamed from: a */
    public String f238824a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f238825b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238826c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f238827d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f238828f;

    static {
        C88307wv wvVar = new C88307wv();
        f238822e = wvVar;
        C62942bv.registerDefaultInstance(C88307wv.class, wvVar);
    }

    private C88307wv() {
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
                return newMessageInfo(f238822e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88307wv();
            case 4:
                return new C88306wu();
            case 5:
                return f238822e;
            case 6:
                C63010eb ebVar = f238823g;
                if (ebVar == null) {
                    synchronized (C88307wv.class) {
                        ebVar = f238823g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238822e);
                            f238823g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
