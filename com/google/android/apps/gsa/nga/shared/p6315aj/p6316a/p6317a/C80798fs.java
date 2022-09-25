package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.fs */
/* compiled from: PG */
public final class C80798fs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80798fs f221719a;

    /* renamed from: b */
    private static volatile C63010eb f221720b;

    static {
        C80798fs fsVar = new C80798fs();
        f221719a = fsVar;
        C62942bv.registerDefaultInstance(C80798fs.class, fsVar);
    }

    private C80798fs() {
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
                return newMessageInfo(f221719a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80798fs();
            case 4:
                return new C80797fr();
            case 5:
                return f221719a;
            case 6:
                C63010eb ebVar = f221720b;
                if (ebVar == null) {
                    synchronized (C80798fs.class) {
                        ebVar = f221720b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221719a);
                            f221720b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
