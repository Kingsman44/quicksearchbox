package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.bu */
/* compiled from: PG */
public final class C8903bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8903bu f30906d;

    /* renamed from: e */
    private static volatile C63010eb f30907e;

    /* renamed from: a */
    public int f30908a;

    /* renamed from: b */
    public String f30909b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f30910c = BuildConfig.FLAVOR;

    static {
        C8903bu buVar = new C8903bu();
        f30906d = buVar;
        C62942bv.registerDefaultInstance(C8903bu.class, buVar);
    }

    private C8903bu() {
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
                return newMessageInfo(f30906d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8903bu();
            case 4:
                return new C8902bt();
            case 5:
                return f30906d;
            case 6:
                C63010eb ebVar = f30907e;
                if (ebVar == null) {
                    synchronized (C8903bu.class) {
                        ebVar = f30907e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30906d);
                            f30907e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
