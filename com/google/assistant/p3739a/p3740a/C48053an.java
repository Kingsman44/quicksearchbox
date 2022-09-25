package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.an */
/* compiled from: PG */
public final class C48053an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48053an f124376a;

    /* renamed from: b */
    private static volatile C63010eb f124377b;

    static {
        C48053an anVar = new C48053an();
        f124376a = anVar;
        C62942bv.registerDefaultInstance(C48053an.class, anVar);
    }

    private C48053an() {
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
                return newMessageInfo(f124376a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48053an();
            case 4:
                return new C48052am();
            case 5:
                return f124376a;
            case 6:
                C63010eb ebVar = f124377b;
                if (ebVar == null) {
                    synchronized (C48053an.class) {
                        ebVar = f124377b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124376a);
                            f124377b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
