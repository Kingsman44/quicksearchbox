package com.google.android.apps.gsa.staticplugins.accl.p7329a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.a.d */
/* compiled from: PG */
public final class C92716d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C92716d f258810e;

    /* renamed from: f */
    private static volatile C63010eb f258811f;

    /* renamed from: a */
    public int f258812a;

    /* renamed from: b */
    public String f258813b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f258814c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f258815d;

    static {
        C92716d dVar = new C92716d();
        f258810e = dVar;
        C62942bv.registerDefaultInstance(C92716d.class, dVar);
    }

    private C92716d() {
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
                return newMessageInfo(f258810e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C92716d();
            case 4:
                return new C92715c();
            case 5:
                return f258810e;
            case 6:
                C63010eb ebVar = f258811f;
                if (ebVar == null) {
                    synchronized (C92716d.class) {
                        ebVar = f258811f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f258810e);
                            f258811f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
