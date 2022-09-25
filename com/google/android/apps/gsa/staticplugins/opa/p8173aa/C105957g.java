package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.g */
/* compiled from: PG */
public final class C105957g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105957g f295831c;

    /* renamed from: d */
    private static volatile C63010eb f295832d;

    /* renamed from: a */
    public int f295833a;

    /* renamed from: b */
    public String f295834b = BuildConfig.FLAVOR;

    static {
        C105957g gVar = new C105957g();
        f295831c = gVar;
        C62942bv.registerDefaultInstance(C105957g.class, gVar);
    }

    private C105957g() {
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
                return newMessageInfo(f295831c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105957g();
            case 4:
                return new C105956f();
            case 5:
                return f295831c;
            case 6:
                C63010eb ebVar = f295832d;
                if (ebVar == null) {
                    synchronized (C105957g.class) {
                        ebVar = f295832d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295831c);
                            f295832d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
