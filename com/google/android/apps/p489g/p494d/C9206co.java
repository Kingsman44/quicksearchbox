package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.co */
/* compiled from: PG */
public final class C9206co extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9206co f31803d;

    /* renamed from: e */
    private static volatile C63010eb f31804e;

    /* renamed from: a */
    public int f31805a;

    /* renamed from: b */
    public String f31806b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31807c = BuildConfig.FLAVOR;

    static {
        C9206co coVar = new C9206co();
        f31803d = coVar;
        C62942bv.registerDefaultInstance(C9206co.class, coVar);
    }

    private C9206co() {
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
                return newMessageInfo(f31803d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9206co();
            case 4:
                return new C9205cn();
            case 5:
                return f31803d;
            case 6:
                C63010eb ebVar = f31804e;
                if (ebVar == null) {
                    synchronized (C9206co.class) {
                        ebVar = f31804e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31803d);
                            f31804e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
