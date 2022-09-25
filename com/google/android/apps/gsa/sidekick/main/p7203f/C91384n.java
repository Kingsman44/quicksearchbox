package com.google.android.apps.gsa.sidekick.main.p7203f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.n */
/* compiled from: PG */
public final class C91384n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C91384n f254956a;

    /* renamed from: b */
    private static volatile C63010eb f254957b;

    static {
        C91384n nVar = new C91384n();
        f254956a = nVar;
        C62942bv.registerDefaultInstance(C91384n.class, nVar);
    }

    private C91384n() {
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
                return newMessageInfo(f254956a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C91384n();
            case 4:
                return new C91383m();
            case 5:
                return f254956a;
            case 6:
                C63010eb ebVar = f254957b;
                if (ebVar == null) {
                    synchronized (C91384n.class) {
                        ebVar = f254957b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f254956a);
                            f254957b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
