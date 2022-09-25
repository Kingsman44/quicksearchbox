package com.google.android.apps.gsa.shared.p6970ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ab.l */
/* compiled from: PG */
public final class C89082l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C89082l f241414d;

    /* renamed from: e */
    private static volatile C63010eb f241415e;

    /* renamed from: a */
    public int f241416a;

    /* renamed from: b */
    public String f241417b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f241418c;

    static {
        C89082l lVar = new C89082l();
        f241414d = lVar;
        C62942bv.registerDefaultInstance(C89082l.class, lVar);
    }

    private C89082l() {
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
                return newMessageInfo(f241414d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C89082l();
            case 4:
                return new C89081k();
            case 5:
                return f241414d;
            case 6:
                C63010eb ebVar = f241415e;
                if (ebVar == null) {
                    synchronized (C89082l.class) {
                        ebVar = f241415e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241414d);
                            f241415e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
