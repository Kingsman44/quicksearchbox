package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.sw */
/* compiled from: PG */
public final class C88200sw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88200sw f238418c;

    /* renamed from: d */
    private static volatile C63010eb f238419d;

    /* renamed from: a */
    public int f238420a;

    /* renamed from: b */
    public int f238421b;

    static {
        C88200sw swVar = new C88200sw();
        f238418c = swVar;
        C62942bv.registerDefaultInstance(C88200sw.class, swVar);
    }

    private C88200sw() {
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
                return newMessageInfo(f238418c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88198su.f238417a});
            case 3:
                return new C88200sw();
            case 4:
                return new C88197st();
            case 5:
                return f238418c;
            case 6:
                C63010eb ebVar = f238419d;
                if (ebVar == null) {
                    synchronized (C88200sw.class) {
                        ebVar = f238419d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238418c);
                            f238419d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
