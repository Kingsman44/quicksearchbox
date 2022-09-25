package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.fu */
/* compiled from: PG */
public final class C80800fu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80800fu f221721a;

    /* renamed from: b */
    private static volatile C63010eb f221722b;

    static {
        C80800fu fuVar = new C80800fu();
        f221721a = fuVar;
        C62942bv.registerDefaultInstance(C80800fu.class, fuVar);
    }

    private C80800fu() {
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
                return newMessageInfo(f221721a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80800fu();
            case 4:
                return new C80799ft();
            case 5:
                return f221721a;
            case 6:
                C63010eb ebVar = f221722b;
                if (ebVar == null) {
                    synchronized (C80800fu.class) {
                        ebVar = f221722b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221721a);
                            f221722b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
