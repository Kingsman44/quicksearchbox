package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.h */
/* compiled from: PG */
public final class C33680h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33680h f89992a;

    /* renamed from: b */
    private static volatile C63010eb f89993b;

    static {
        C33680h hVar = new C33680h();
        f89992a = hVar;
        C62942bv.registerDefaultInstance(C33680h.class, hVar);
    }

    private C33680h() {
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
                return newMessageInfo(f89992a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33680h();
            case 4:
                return new C33679g();
            case 5:
                return f89992a;
            case 6:
                C63010eb ebVar = f89993b;
                if (ebVar == null) {
                    synchronized (C33680h.class) {
                        ebVar = f89993b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89992a);
                            f89993b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
