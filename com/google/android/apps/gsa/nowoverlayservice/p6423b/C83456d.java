package com.google.android.apps.gsa.nowoverlayservice.p6423b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.b.d */
/* compiled from: PG */
public final class C83456d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83456d f227492e;

    /* renamed from: g */
    private static volatile C63010eb f227493g;

    /* renamed from: a */
    public String f227494a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f227495b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f227496c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f227497d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f227498f;

    static {
        C83456d dVar = new C83456d();
        f227492e = dVar;
        C62942bv.registerDefaultInstance(C83456d.class, dVar);
    }

    private C83456d() {
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
                return newMessageInfo(f227492e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C83456d();
            case 4:
                return new C83455c();
            case 5:
                return f227492e;
            case 6:
                C63010eb ebVar = f227493g;
                if (ebVar == null) {
                    synchronized (C83456d.class) {
                        ebVar = f227493g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227492e);
                            f227493g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
