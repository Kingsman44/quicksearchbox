package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50375ut;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.au */
/* compiled from: PG */
public final class C102099au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C102099au f284823d;

    /* renamed from: e */
    private static volatile C63010eb f284824e;

    /* renamed from: a */
    public int f284825a;

    /* renamed from: b */
    public C101781u f284826b;

    /* renamed from: c */
    public C50375ut f284827c;

    static {
        C102099au auVar = new C102099au();
        f284823d = auVar;
        C62942bv.registerDefaultInstance(C102099au.class, auVar);
    }

    private C102099au() {
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
                return newMessageInfo(f284823d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C102099au();
            case 4:
                return new C102098at();
            case 5:
                return f284823d;
            case 6:
                C63010eb ebVar = f284824e;
                if (ebVar == null) {
                    synchronized (C102099au.class) {
                        ebVar = f284824e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f284823d);
                            f284824e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
