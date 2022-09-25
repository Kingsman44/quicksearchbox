package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ci */
/* compiled from: PG */
public final class C14252ci extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14252ci f43124a;

    /* renamed from: b */
    private static volatile C63010eb f43125b;

    static {
        C14252ci ciVar = new C14252ci();
        f43124a = ciVar;
        C62942bv.registerDefaultInstance(C14252ci.class, ciVar);
    }

    private C14252ci() {
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
                return newMessageInfo(f43124a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14252ci();
            case 4:
                return new C14251ch();
            case 5:
                return f43124a;
            case 6:
                C63010eb ebVar = f43125b;
                if (ebVar == null) {
                    synchronized (C14252ci.class) {
                        ebVar = f43125b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43124a);
                            f43125b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
