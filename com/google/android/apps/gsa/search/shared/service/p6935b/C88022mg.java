package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.mg */
/* compiled from: PG */
public final class C88022mg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C88022mg f238025a;

    /* renamed from: b */
    private static volatile C63010eb f238026b;

    static {
        C88022mg mgVar = new C88022mg();
        f238025a = mgVar;
        C62942bv.registerDefaultInstance(C88022mg.class, mgVar);
    }

    private C88022mg() {
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
                return newMessageInfo(f238025a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C88022mg();
            case 4:
                return new C88021mf();
            case 5:
                return f238025a;
            case 6:
                C63010eb ebVar = f238026b;
                if (ebVar == null) {
                    synchronized (C88022mg.class) {
                        ebVar = f238026b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238025a);
                            f238026b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
