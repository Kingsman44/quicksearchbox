package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.f */
/* compiled from: PG */
public final class C139006f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C139006f f378037e;

    /* renamed from: f */
    private static volatile C63010eb f378038f;

    /* renamed from: a */
    public int f378039a;

    /* renamed from: b */
    public String f378040b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C139008h f378041c;

    /* renamed from: d */
    public C139008h f378042d;

    static {
        C139006f fVar = new C139006f();
        f378037e = fVar;
        C62942bv.registerDefaultInstance(C139006f.class, fVar);
    }

    private C139006f() {
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
                return newMessageInfo(f378037e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C139006f();
            case 4:
                return new C139005e();
            case 5:
                return f378037e;
            case 6:
                C63010eb ebVar = f378038f;
                if (ebVar == null) {
                    synchronized (C139006f.class) {
                        ebVar = f378038f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378037e);
                            f378038f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
