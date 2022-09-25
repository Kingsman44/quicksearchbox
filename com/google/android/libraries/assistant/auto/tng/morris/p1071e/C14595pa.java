package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pa */
/* compiled from: PG */
public final class C14595pa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14595pa f44120a;

    /* renamed from: b */
    private static volatile C63010eb f44121b;

    static {
        C14595pa paVar = new C14595pa();
        f44120a = paVar;
        C62942bv.registerDefaultInstance(C14595pa.class, paVar);
    }

    private C14595pa() {
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
                return newMessageInfo(f44120a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14595pa();
            case 4:
                return new C14593oz();
            case 5:
                return f44120a;
            case 6:
                C63010eb ebVar = f44121b;
                if (ebVar == null) {
                    synchronized (C14595pa.class) {
                        ebVar = f44121b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44120a);
                            f44121b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
