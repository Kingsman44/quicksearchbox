package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bd */
/* compiled from: PG */
public final class C7550bd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7550bd f26122a;

    /* renamed from: b */
    private static volatile C63010eb f26123b;

    static {
        C7550bd bdVar = new C7550bd();
        f26122a = bdVar;
        C62942bv.registerDefaultInstance(C7550bd.class, bdVar);
    }

    private C7550bd() {
        emptyProtobufList();
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
                return newMessageInfo(f26122a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7550bd();
            case 4:
                return new C7549bc();
            case 5:
                return f26122a;
            case 6:
                C63010eb ebVar = f26123b;
                if (ebVar == null) {
                    synchronized (C7550bd.class) {
                        ebVar = f26123b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26122a);
                            f26123b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
