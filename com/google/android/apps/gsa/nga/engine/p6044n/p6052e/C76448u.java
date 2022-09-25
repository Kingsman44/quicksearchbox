package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.u */
/* compiled from: PG */
public final class C76448u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C76448u f211619a;

    /* renamed from: b */
    private static volatile C63010eb f211620b;

    static {
        C76448u uVar = new C76448u();
        f211619a = uVar;
        C62942bv.registerDefaultInstance(C76448u.class, uVar);
    }

    private C76448u() {
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
                return newMessageInfo(f211619a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C76448u();
            case 4:
                return new C76447t();
            case 5:
                return f211619a;
            case 6:
                C63010eb ebVar = f211620b;
                if (ebVar == null) {
                    synchronized (C76448u.class) {
                        ebVar = f211620b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211619a);
                            f211620b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
