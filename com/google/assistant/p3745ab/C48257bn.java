package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.bn */
/* compiled from: PG */
public final class C48257bn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48257bn f124822a;

    /* renamed from: b */
    private static volatile C63010eb f124823b;

    static {
        C48257bn bnVar = new C48257bn();
        f124822a = bnVar;
        C62942bv.registerDefaultInstance(C48257bn.class, bnVar);
    }

    private C48257bn() {
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
                return newMessageInfo(f124822a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48257bn();
            case 4:
                return new C48256bm();
            case 5:
                return f124822a;
            case 6:
                C63010eb ebVar = f124823b;
                if (ebVar == null) {
                    synchronized (C48257bn.class) {
                        ebVar = f124823b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124822a);
                            f124823b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
