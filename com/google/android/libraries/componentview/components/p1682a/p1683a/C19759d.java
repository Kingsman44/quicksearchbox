package com.google.android.libraries.componentview.components.p1682a.p1683a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.a.a.d */
/* compiled from: PG */
public final class C19759d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19759d f55189d;

    /* renamed from: e */
    private static volatile C63010eb f55190e;

    /* renamed from: a */
    public int f55191a;

    /* renamed from: b */
    public String f55192b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f55193c = BuildConfig.FLAVOR;

    static {
        C19759d dVar = new C19759d();
        f55189d = dVar;
        C62942bv.registerDefaultInstance(C19759d.class, dVar);
    }

    private C19759d() {
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
                return newMessageInfo(f55189d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C19759d();
            case 4:
                return new C19758c();
            case 5:
                return f55189d;
            case 6:
                C63010eb ebVar = f55190e;
                if (ebVar == null) {
                    synchronized (C19759d.class) {
                        ebVar = f55190e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55189d);
                            f55190e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
