package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ep */
/* compiled from: PG */
public final class C14313ep extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14313ep f43299a;

    /* renamed from: b */
    private static volatile C63010eb f43300b;

    static {
        C14313ep epVar = new C14313ep();
        f43299a = epVar;
        C62942bv.registerDefaultInstance(C14313ep.class, epVar);
    }

    private C14313ep() {
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
                return newMessageInfo(f43299a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14313ep();
            case 4:
                return new C14312eo();
            case 5:
                return f43299a;
            case 6:
                C63010eb ebVar = f43300b;
                if (ebVar == null) {
                    synchronized (C14313ep.class) {
                        ebVar = f43300b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43299a);
                            f43300b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
