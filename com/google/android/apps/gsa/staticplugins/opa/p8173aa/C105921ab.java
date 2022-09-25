package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.ab */
/* compiled from: PG */
public final class C105921ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C105921ab f295731d;

    /* renamed from: e */
    private static volatile C63010eb f295732e;

    /* renamed from: a */
    public int f295733a;

    /* renamed from: b */
    public String f295734b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f295735c;

    static {
        C105921ab abVar = new C105921ab();
        f295731d = abVar;
        C62942bv.registerDefaultInstance(C105921ab.class, abVar);
    }

    private C105921ab() {
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
                return newMessageInfo(f295731d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C105921ab();
            case 4:
                return new C105920aa();
            case 5:
                return f295731d;
            case 6:
                C63010eb ebVar = f295732e;
                if (ebVar == null) {
                    synchronized (C105921ab.class) {
                        ebVar = f295732e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295731d);
                            f295732e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
