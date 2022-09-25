package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hy */
/* compiled from: PG */
public final class C82990hy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82990hy f226472a;

    /* renamed from: b */
    private static volatile C63010eb f226473b;

    static {
        C82990hy hyVar = new C82990hy();
        f226472a = hyVar;
        C62942bv.registerDefaultInstance(C82990hy.class, hyVar);
    }

    private C82990hy() {
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
                return newMessageInfo(f226472a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82990hy();
            case 4:
                return new C82989hx();
            case 5:
                return f226472a;
            case 6:
                C63010eb ebVar = f226473b;
                if (ebVar == null) {
                    synchronized (C82990hy.class) {
                        ebVar = f226473b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226472a);
                            f226473b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
