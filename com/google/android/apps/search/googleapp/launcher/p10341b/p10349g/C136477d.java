package com.google.android.apps.search.googleapp.launcher.p10341b.p10349g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.g.d */
/* compiled from: PG */
public final class C136477d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136477d f371568d;

    /* renamed from: f */
    private static volatile C63010eb f371569f;

    /* renamed from: a */
    public String f371570a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f371571b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f371572c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f371573e;

    static {
        C136477d dVar = new C136477d();
        f371568d = dVar;
        C62942bv.registerDefaultInstance(C136477d.class, dVar);
    }

    private C136477d() {
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
                return newMessageInfo(f371568d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C136477d();
            case 4:
                return new C136476c();
            case 5:
                return f371568d;
            case 6:
                C63010eb ebVar = f371569f;
                if (ebVar == null) {
                    synchronized (C136477d.class) {
                        ebVar = f371569f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371568d);
                            f371569f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
