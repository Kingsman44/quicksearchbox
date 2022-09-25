package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.aj */
/* compiled from: PG */
public final class C105929aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105929aj f295750c;

    /* renamed from: d */
    private static volatile C63010eb f295751d;

    /* renamed from: a */
    public int f295752a;

    /* renamed from: b */
    public String f295753b = BuildConfig.FLAVOR;

    static {
        C105929aj ajVar = new C105929aj();
        f295750c = ajVar;
        C62942bv.registerDefaultInstance(C105929aj.class, ajVar);
    }

    private C105929aj() {
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
                return newMessageInfo(f295750c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105929aj();
            case 4:
                return new C105928ai();
            case 5:
                return f295750c;
            case 6:
                C63010eb ebVar = f295751d;
                if (ebVar == null) {
                    synchronized (C105929aj.class) {
                        ebVar = f295751d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295750c);
                            f295751d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
