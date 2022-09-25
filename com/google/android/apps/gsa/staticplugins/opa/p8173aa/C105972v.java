package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.v */
/* compiled from: PG */
public final class C105972v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105972v f295868c;

    /* renamed from: d */
    private static volatile C63010eb f295869d;

    /* renamed from: a */
    public int f295870a;

    /* renamed from: b */
    public String f295871b = BuildConfig.FLAVOR;

    static {
        C105972v vVar = new C105972v();
        f295868c = vVar;
        C62942bv.registerDefaultInstance(C105972v.class, vVar);
    }

    private C105972v() {
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
                return newMessageInfo(f295868c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105972v();
            case 4:
                return new C105971u();
            case 5:
                return f295868c;
            case 6:
                C63010eb ebVar = f295869d;
                if (ebVar == null) {
                    synchronized (C105972v.class) {
                        ebVar = f295869d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295868c);
                            f295869d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
