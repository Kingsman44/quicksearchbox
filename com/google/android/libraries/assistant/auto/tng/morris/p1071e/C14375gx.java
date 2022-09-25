package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gx */
/* compiled from: PG */
public final class C14375gx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14375gx f43500a;

    /* renamed from: b */
    private static volatile C63010eb f43501b;

    static {
        C14375gx gxVar = new C14375gx();
        f43500a = gxVar;
        C62942bv.registerDefaultInstance(C14375gx.class, gxVar);
    }

    private C14375gx() {
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
                return newMessageInfo(f43500a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14375gx();
            case 4:
                return new C14374gw();
            case 5:
                return f43500a;
            case 6:
                C63010eb ebVar = f43501b;
                if (ebVar == null) {
                    synchronized (C14375gx.class) {
                        ebVar = f43501b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43500a);
                            f43501b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
