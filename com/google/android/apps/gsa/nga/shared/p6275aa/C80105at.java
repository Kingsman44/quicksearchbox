package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.at */
/* compiled from: PG */
public final class C80105at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80105at f219815a;

    /* renamed from: b */
    private static volatile C63010eb f219816b;

    static {
        C80105at atVar = new C80105at();
        f219815a = atVar;
        C62942bv.registerDefaultInstance(C80105at.class, atVar);
    }

    private C80105at() {
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
                return newMessageInfo(f219815a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80105at();
            case 4:
                return new C80104as();
            case 5:
                return f219815a;
            case 6:
                C63010eb ebVar = f219816b;
                if (ebVar == null) {
                    synchronized (C80105at.class) {
                        ebVar = f219816b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219815a);
                            f219816b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
