package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ed */
/* compiled from: PG */
public final class C80756ed extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80756ed f221660a;

    /* renamed from: b */
    private static volatile C63010eb f221661b;

    static {
        C80756ed edVar = new C80756ed();
        f221660a = edVar;
        C62942bv.registerDefaultInstance(C80756ed.class, edVar);
    }

    private C80756ed() {
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
                return newMessageInfo(f221660a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80756ed();
            case 4:
                return new C80755ec();
            case 5:
                return f221660a;
            case 6:
                C63010eb ebVar = f221661b;
                if (ebVar == null) {
                    synchronized (C80756ed.class) {
                        ebVar = f221661b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221660a);
                            f221661b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
