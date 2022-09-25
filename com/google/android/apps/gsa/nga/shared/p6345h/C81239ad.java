package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.ad */
/* compiled from: PG */
public final class C81239ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C81239ad f222408a;

    /* renamed from: b */
    private static volatile C63010eb f222409b;

    static {
        C81239ad adVar = new C81239ad();
        f222408a = adVar;
        C62942bv.registerDefaultInstance(C81239ad.class, adVar);
    }

    private C81239ad() {
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
                return newMessageInfo(f222408a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C81239ad();
            case 4:
                return new C81238ac();
            case 5:
                return f222408a;
            case 6:
                C63010eb ebVar = f222409b;
                if (ebVar == null) {
                    synchronized (C81239ad.class) {
                        ebVar = f222409b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222408a);
                            f222409b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
