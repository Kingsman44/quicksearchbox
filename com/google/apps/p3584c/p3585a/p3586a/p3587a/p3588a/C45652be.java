package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.be */
/* compiled from: PG */
public final class C45652be extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45652be f120099d;

    /* renamed from: e */
    private static volatile C63010eb f120100e;

    /* renamed from: a */
    public int f120101a;

    /* renamed from: b */
    public String f120102b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f120103c = BuildConfig.FLAVOR;

    static {
        C45652be beVar = new C45652be();
        f120099d = beVar;
        C62942bv.registerDefaultInstance(C45652be.class, beVar);
    }

    private C45652be() {
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
                return newMessageInfo(f120099d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45652be();
            case 4:
                return new C45651bd();
            case 5:
                return f120099d;
            case 6:
                C63010eb ebVar = f120100e;
                if (ebVar == null) {
                    synchronized (C45652be.class) {
                        ebVar = f120100e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120099d);
                            f120100e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
