package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.gb */
/* compiled from: PG */
public final class C87855gb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87855gb f237694c;

    /* renamed from: d */
    private static volatile C63010eb f237695d;

    /* renamed from: a */
    public int f237696a;

    /* renamed from: b */
    public boolean f237697b;

    static {
        C87855gb gbVar = new C87855gb();
        f237694c = gbVar;
        C62942bv.registerDefaultInstance(C87855gb.class, gbVar);
    }

    private C87855gb() {
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
                return newMessageInfo(f237694c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87855gb();
            case 4:
                return new C87854ga();
            case 5:
                return f237694c;
            case 6:
                C63010eb ebVar = f237695d;
                if (ebVar == null) {
                    synchronized (C87855gb.class) {
                        ebVar = f237695d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237694c);
                            f237695d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
