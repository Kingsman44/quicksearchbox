package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.js */
/* compiled from: PG */
public final class C53325js extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53325js f139830a;

    /* renamed from: b */
    private static volatile C63010eb f139831b;

    static {
        C53325js jsVar = new C53325js();
        f139830a = jsVar;
        C62942bv.registerDefaultInstance(C53325js.class, jsVar);
    }

    private C53325js() {
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
                return newMessageInfo(f139830a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53325js();
            case 4:
                return new C53324jr();
            case 5:
                return f139830a;
            case 6:
                C63010eb ebVar = f139831b;
                if (ebVar == null) {
                    synchronized (C53325js.class) {
                        ebVar = f139831b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139830a);
                            f139831b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
