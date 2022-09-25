package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.y */
/* compiled from: PG */
public final class C105975y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C105975y f295872f;

    /* renamed from: g */
    private static volatile C63010eb f295873g;

    /* renamed from: a */
    public int f295874a;

    /* renamed from: b */
    public String f295875b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f295876c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f295877d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f295878e;

    static {
        C105975y yVar = new C105975y();
        f295872f = yVar;
        C62942bv.registerDefaultInstance(C105975y.class, yVar);
    }

    private C105975y() {
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
                return newMessageInfo(f295872f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C105975y();
            case 4:
                return new C105974x();
            case 5:
                return f295872f;
            case 6:
                C63010eb ebVar = f295873g;
                if (ebVar == null) {
                    synchronized (C105975y.class) {
                        ebVar = f295873g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295872f);
                            f295873g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
