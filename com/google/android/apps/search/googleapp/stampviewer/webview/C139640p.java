package com.google.android.apps.search.googleapp.stampviewer.webview;

import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.p */
/* compiled from: PG */
public final class C139640p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C139640p f379603f;

    /* renamed from: g */
    private static volatile C63010eb f379604g;

    /* renamed from: a */
    public int f379605a;

    /* renamed from: b */
    public boolean f379606b;

    /* renamed from: c */
    public boolean f379607c;

    /* renamed from: d */
    public boolean f379608d;

    /* renamed from: e */
    public int f379609e;

    static {
        C139640p pVar = new C139640p();
        f379603f = pVar;
        C62942bv.registerDefaultInstance(C139640p.class, pVar);
    }

    private C139640p() {
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
                return newMessageInfo(f379603f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C139343y.m226484b()});
            case 3:
                return new C139640p();
            case 4:
                return new C139639o();
            case 5:
                return f379603f;
            case 6:
                C63010eb ebVar = f379604g;
                if (ebVar == null) {
                    synchronized (C139640p.class) {
                        ebVar = f379604g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379603f);
                            f379604g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
