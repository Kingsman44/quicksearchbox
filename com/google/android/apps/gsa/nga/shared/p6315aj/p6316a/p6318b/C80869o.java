package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.o */
/* compiled from: PG */
public final class C80869o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80869o f221817a;

    /* renamed from: b */
    private static volatile C63010eb f221818b;

    static {
        C80869o oVar = new C80869o();
        f221817a = oVar;
        C62942bv.registerDefaultInstance(C80869o.class, oVar);
    }

    private C80869o() {
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
                return newMessageInfo(f221817a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80869o();
            case 4:
                return new C80868n();
            case 5:
                return f221817a;
            case 6:
                C63010eb ebVar = f221818b;
                if (ebVar == null) {
                    synchronized (C80869o.class) {
                        ebVar = f221818b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221817a);
                            f221818b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
