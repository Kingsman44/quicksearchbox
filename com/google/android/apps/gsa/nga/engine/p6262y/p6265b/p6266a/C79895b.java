package com.google.android.apps.gsa.nga.engine.p6262y.p6265b.p6266a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.b.a.b */
/* compiled from: PG */
public final class C79895b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C79895b f218988b;

    /* renamed from: d */
    private static volatile C63010eb f218989d;

    /* renamed from: a */
    public String f218990a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f218991c;

    static {
        C79895b bVar = new C79895b();
        f218988b = bVar;
        C62942bv.registerDefaultInstance(C79895b.class, bVar);
    }

    private C79895b() {
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
                return newMessageInfo(f218988b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C79895b();
            case 4:
                return new C79894a();
            case 5:
                return f218988b;
            case 6:
                C63010eb ebVar = f218989d;
                if (ebVar == null) {
                    synchronized (C79895b.class) {
                        ebVar = f218989d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218988b);
                            f218989d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
