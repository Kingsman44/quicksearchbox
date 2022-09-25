package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.eh */
/* compiled from: PG */
public final class C14305eh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14305eh f43272a;

    /* renamed from: b */
    private static volatile C63010eb f43273b;

    static {
        C14305eh ehVar = new C14305eh();
        f43272a = ehVar;
        C62942bv.registerDefaultInstance(C14305eh.class, ehVar);
    }

    private C14305eh() {
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
                return newMessageInfo(f43272a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14305eh();
            case 4:
                return new C14304eg();
            case 5:
                return f43272a;
            case 6:
                C63010eb ebVar = f43273b;
                if (ebVar == null) {
                    synchronized (C14305eh.class) {
                        ebVar = f43273b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43272a);
                            f43273b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
