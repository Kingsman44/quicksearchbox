package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.aj */
/* compiled from: PG */
public final class C14199aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14199aj f42976a;

    /* renamed from: b */
    private static volatile C63010eb f42977b;

    static {
        C14199aj ajVar = new C14199aj();
        f42976a = ajVar;
        C62942bv.registerDefaultInstance(C14199aj.class, ajVar);
    }

    private C14199aj() {
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
                return newMessageInfo(f42976a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14199aj();
            case 4:
                return new C14198ai();
            case 5:
                return f42976a;
            case 6:
                C63010eb ebVar = f42977b;
                if (ebVar == null) {
                    synchronized (C14199aj.class) {
                        ebVar = f42977b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42976a);
                            f42977b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
