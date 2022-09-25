package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ke */
/* compiled from: PG */
public final class C14464ke extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14464ke f43735a;

    /* renamed from: b */
    private static volatile C63010eb f43736b;

    static {
        C14464ke keVar = new C14464ke();
        f43735a = keVar;
        C62942bv.registerDefaultInstance(C14464ke.class, keVar);
    }

    private C14464ke() {
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
                return newMessageInfo(f43735a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14464ke();
            case 4:
                return new C14463kd();
            case 5:
                return f43735a;
            case 6:
                C63010eb ebVar = f43736b;
                if (ebVar == null) {
                    synchronized (C14464ke.class) {
                        ebVar = f43736b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43735a);
                            f43736b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
