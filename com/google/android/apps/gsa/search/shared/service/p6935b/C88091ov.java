package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ov */
/* compiled from: PG */
public final class C88091ov extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88091ov f238169c;

    /* renamed from: d */
    private static volatile C63010eb f238170d;

    /* renamed from: a */
    public int f238171a;

    /* renamed from: b */
    public int f238172b;

    static {
        C88091ov ovVar = new C88091ov();
        f238169c = ovVar;
        C62942bv.registerDefaultInstance(C88091ov.class, ovVar);
    }

    private C88091ov() {
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
                return newMessageInfo(f238169c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88090ou.m142783b()});
            case 3:
                return new C88091ov();
            case 4:
                return new C88088os();
            case 5:
                return f238169c;
            case 6:
                C63010eb ebVar = f238170d;
                if (ebVar == null) {
                    synchronized (C88091ov.class) {
                        ebVar = f238170d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238169c);
                            f238170d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
