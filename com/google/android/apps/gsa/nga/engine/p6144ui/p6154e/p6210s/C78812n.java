package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.n */
/* compiled from: PG */
public final class C78812n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C78812n f216920a;

    /* renamed from: b */
    private static volatile C63010eb f216921b;

    static {
        C78812n nVar = new C78812n();
        f216920a = nVar;
        C62942bv.registerDefaultInstance(C78812n.class, nVar);
    }

    private C78812n() {
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
                return newMessageInfo(f216920a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C78812n();
            case 4:
                return new C78811m();
            case 5:
                return f216920a;
            case 6:
                C63010eb ebVar = f216921b;
                if (ebVar == null) {
                    synchronized (C78812n.class) {
                        ebVar = f216921b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216920a);
                            f216921b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
