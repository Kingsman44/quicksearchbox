package com.google.android.apps.gsa.staticplugins.bisto.p7534y;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.y.d */
/* compiled from: PG */
public final class C96634d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C96634d f270324e;

    /* renamed from: f */
    private static volatile C63010eb f270325f;

    /* renamed from: a */
    public String f270326a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f270327b;

    /* renamed from: c */
    public String f270328c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f270329d;

    static {
        C96634d dVar = new C96634d();
        f270324e = dVar;
        C62942bv.registerDefaultInstance(C96634d.class, dVar);
    }

    private C96634d() {
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
                return newMessageInfo(f270324e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0010", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C96634d();
            case 4:
                return new C96633c();
            case 5:
                return f270324e;
            case 6:
                C63010eb ebVar = f270325f;
                if (ebVar == null) {
                    synchronized (C96634d.class) {
                        ebVar = f270325f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f270324e);
                            f270325f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
