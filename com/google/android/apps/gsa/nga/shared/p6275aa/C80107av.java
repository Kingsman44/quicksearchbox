package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.av */
/* compiled from: PG */
public final class C80107av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80107av f219817a;

    /* renamed from: b */
    private static volatile C63010eb f219818b;

    static {
        C80107av avVar = new C80107av();
        f219817a = avVar;
        C62942bv.registerDefaultInstance(C80107av.class, avVar);
    }

    private C80107av() {
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
                return newMessageInfo(f219817a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80107av();
            case 4:
                return new C80106au();
            case 5:
                return f219817a;
            case 6:
                C63010eb ebVar = f219818b;
                if (ebVar == null) {
                    synchronized (C80107av.class) {
                        ebVar = f219818b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219817a);
                            f219818b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
