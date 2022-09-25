package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.as */
/* compiled from: PG */
public final class C18456as extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18456as f52374a;

    /* renamed from: b */
    private static volatile C63010eb f52375b;

    static {
        C18456as asVar = new C18456as();
        f52374a = asVar;
        C62942bv.registerDefaultInstance(C18456as.class, asVar);
    }

    private C18456as() {
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
                return newMessageInfo(f52374a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C18456as();
            case 4:
                return new C18455ar();
            case 5:
                return f52374a;
            case 6:
                C63010eb ebVar = f52375b;
                if (ebVar == null) {
                    synchronized (C18456as.class) {
                        ebVar = f52375b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52374a);
                            f52375b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
