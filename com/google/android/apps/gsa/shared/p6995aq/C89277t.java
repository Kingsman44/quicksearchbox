package com.google.android.apps.gsa.shared.p6995aq;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aq.t */
/* compiled from: PG */
public final class C89277t extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C89277t f242049g;

    /* renamed from: h */
    private static volatile C63010eb f242050h;

    /* renamed from: a */
    public int f242051a;

    /* renamed from: b */
    public int f242052b;

    /* renamed from: c */
    public String f242053c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f242054d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f242055e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f242056f = BuildConfig.FLAVOR;

    static {
        C89277t tVar = new C89277t();
        f242049g = tVar;
        C62942bv.registerDefaultInstance(C89277t.class, tVar);
    }

    private C89277t() {
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
                return newMessageInfo(f242049g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C89275r.f242048a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C89277t();
            case 4:
                return new C89274q();
            case 5:
                return f242049g;
            case 6:
                C63010eb ebVar = f242050h;
                if (ebVar == null) {
                    synchronized (C89277t.class) {
                        ebVar = f242050h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242049g);
                            f242050h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
