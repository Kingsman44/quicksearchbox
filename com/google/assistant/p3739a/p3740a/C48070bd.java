package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bd */
/* compiled from: PG */
public final class C48070bd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48070bd f124411a;

    /* renamed from: b */
    private static volatile C63010eb f124412b;

    static {
        C48070bd bdVar = new C48070bd();
        f124411a = bdVar;
        C62942bv.registerDefaultInstance(C48070bd.class, bdVar);
    }

    private C48070bd() {
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
                return newMessageInfo(f124411a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48070bd();
            case 4:
                return new C48069bc();
            case 5:
                return f124411a;
            case 6:
                C63010eb ebVar = f124412b;
                if (ebVar == null) {
                    synchronized (C48070bd.class) {
                        ebVar = f124412b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124411a);
                            f124412b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
