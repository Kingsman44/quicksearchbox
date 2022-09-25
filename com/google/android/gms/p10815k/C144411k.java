package com.google.android.gms.p10815k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.k.k */
/* compiled from: PG */
public final class C144411k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C144411k f390997b;

    /* renamed from: c */
    private static volatile C63010eb f390998c;

    /* renamed from: a */
    public C62995dn f390999a = C62995dn.f170057a;

    static {
        C144411k kVar = new C144411k();
        f390997b = kVar;
        C62942bv.registerDefaultInstance(C144411k.class, kVar);
    }

    private C144411k() {
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
                return newMessageInfo(f390997b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C144409i.f390996a});
            case 3:
                return new C144411k();
            case 4:
                return new C144410j();
            case 5:
                return f390997b;
            case 6:
                C63010eb ebVar = f390998c;
                if (ebVar == null) {
                    synchronized (C144411k.class) {
                        ebVar = f390998c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f390997b);
                            f390998c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
