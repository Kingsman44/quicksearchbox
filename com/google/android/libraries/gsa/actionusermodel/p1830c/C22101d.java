package com.google.android.libraries.gsa.actionusermodel.p1830c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c.d */
/* compiled from: PG */
public final class C22101d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22101d f60914d;

    /* renamed from: e */
    private static volatile C63010eb f60915e;

    /* renamed from: a */
    public int f60916a;

    /* renamed from: b */
    public String f60917b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f60918c;

    static {
        C22101d dVar = new C22101d();
        f60914d = dVar;
        C62942bv.registerDefaultInstance(C22101d.class, dVar);
    }

    private C22101d() {
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
                return newMessageInfo(f60914d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C22101d();
            case 4:
                return new C22100c();
            case 5:
                return f60914d;
            case 6:
                C63010eb ebVar = f60915e;
                if (ebVar == null) {
                    synchronized (C22101d.class) {
                        ebVar = f60915e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60914d);
                            f60915e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
