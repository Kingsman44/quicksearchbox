package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.f */
/* compiled from: PG */
public final class C48322f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48322f f124964b;

    /* renamed from: c */
    private static volatile C63010eb f124965c;

    /* renamed from: a */
    public C48241b f124966a;

    static {
        C48322f fVar = new C48322f();
        f124964b = fVar;
        C62942bv.registerDefaultInstance(C48322f.class, fVar);
    }

    private C48322f() {
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
                return newMessageInfo(f124964b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C48322f();
            case 4:
                return new C48319e();
            case 5:
                return f124964b;
            case 6:
                C63010eb ebVar = f124965c;
                if (ebVar == null) {
                    synchronized (C48322f.class) {
                        ebVar = f124965c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124964b);
                            f124965c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
