package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ph */
/* compiled from: PG */
public final class C52372ph extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52372ph f137431b;

    /* renamed from: c */
    private static volatile C63010eb f137432c;

    /* renamed from: a */
    public C62971cq f137433a = emptyProtobufList();

    static {
        C52372ph phVar = new C52372ph();
        f137431b = phVar;
        C62942bv.registerDefaultInstance(C52372ph.class, phVar);
    }

    private C52372ph() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f137431b, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"a", C52376pl.class});
            case 3:
                return new C52372ph();
            case 4:
                return new C52371pg();
            case 5:
                return f137431b;
            case 6:
                C63010eb ebVar = f137432c;
                if (ebVar == null) {
                    synchronized (C52372ph.class) {
                        ebVar = f137432c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137431b);
                            f137432c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
