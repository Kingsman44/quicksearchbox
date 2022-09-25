package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.t */
/* compiled from: PG */
public final class C79588t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C79588t f218368a;

    /* renamed from: c */
    private static volatile C63010eb f218369c;

    /* renamed from: b */
    private C62995dn f218370b = C62995dn.f170057a;

    static {
        C79588t tVar = new C79588t();
        f218368a = tVar;
        C62942bv.registerDefaultInstance(C79588t.class, tVar);
    }

    private C79588t() {
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
                return newMessageInfo(f218368a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C79587s.f218367a});
            case 3:
                return new C79588t();
            case 4:
                return new C79584p();
            case 5:
                return f218368a;
            case 6:
                C63010eb ebVar = f218369c;
                if (ebVar == null) {
                    synchronized (C79588t.class) {
                        ebVar = f218369c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218368a);
                            f218369c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
