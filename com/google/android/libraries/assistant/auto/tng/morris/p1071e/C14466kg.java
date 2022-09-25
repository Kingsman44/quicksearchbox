package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kg */
/* compiled from: PG */
public final class C14466kg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14466kg f43737a;

    /* renamed from: b */
    private static volatile C63010eb f43738b;

    static {
        C14466kg kgVar = new C14466kg();
        f43737a = kgVar;
        C62942bv.registerDefaultInstance(C14466kg.class, kgVar);
    }

    private C14466kg() {
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
                return newMessageInfo(f43737a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14466kg();
            case 4:
                return new C14465kf();
            case 5:
                return f43737a;
            case 6:
                C63010eb ebVar = f43738b;
                if (ebVar == null) {
                    synchronized (C14466kg.class) {
                        ebVar = f43738b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43737a);
                            f43738b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
