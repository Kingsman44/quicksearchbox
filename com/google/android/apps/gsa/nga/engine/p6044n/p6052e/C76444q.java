package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.q */
/* compiled from: PG */
public final class C76444q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C76444q f211615a;

    /* renamed from: b */
    private static volatile C63010eb f211616b;

    static {
        C76444q qVar = new C76444q();
        f211615a = qVar;
        C62942bv.registerDefaultInstance(C76444q.class, qVar);
    }

    private C76444q() {
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
                return newMessageInfo(f211615a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C76444q();
            case 4:
                return new C76443p();
            case 5:
                return f211615a;
            case 6:
                C63010eb ebVar = f211616b;
                if (ebVar == null) {
                    synchronized (C76444q.class) {
                        ebVar = f211616b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211615a);
                            f211616b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
