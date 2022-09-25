package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.w */
/* compiled from: PG */
public final class C80877w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80877w f221828a;

    /* renamed from: b */
    private static volatile C63010eb f221829b;

    static {
        C80877w wVar = new C80877w();
        f221828a = wVar;
        C62942bv.registerDefaultInstance(C80877w.class, wVar);
    }

    private C80877w() {
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
                return newMessageInfo(f221828a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80877w();
            case 4:
                return new C80876v();
            case 5:
                return f221828a;
            case 6:
                C63010eb ebVar = f221829b;
                if (ebVar == null) {
                    synchronized (C80877w.class) {
                        ebVar = f221829b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221828a);
                            f221829b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
