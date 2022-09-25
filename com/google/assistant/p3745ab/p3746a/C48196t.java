package com.google.assistant.p3745ab.p3746a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.t */
/* compiled from: PG */
public final class C48196t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48196t f124721a;

    /* renamed from: b */
    private static volatile C63010eb f124722b;

    static {
        C48196t tVar = new C48196t();
        f124721a = tVar;
        C62942bv.registerDefaultInstance(C48196t.class, tVar);
    }

    private C48196t() {
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
                return newMessageInfo(f124721a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48196t();
            case 4:
                return new C48195s();
            case 5:
                return f124721a;
            case 6:
                C63010eb ebVar = f124722b;
                if (ebVar == null) {
                    synchronized (C48196t.class) {
                        ebVar = f124722b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124721a);
                            f124722b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
