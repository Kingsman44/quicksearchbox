package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.kd */
/* compiled from: PG */
public final class C51504kd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51504kd f134182b;

    /* renamed from: c */
    private static volatile C63010eb f134183c;

    /* renamed from: a */
    public C62971cq f134184a = emptyProtobufList();

    static {
        C51504kd kdVar = new C51504kd();
        f134182b = kdVar;
        C62942bv.registerDefaultInstance(C51504kd.class, kdVar);
    }

    private C51504kd() {
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
                return newMessageInfo(f134182b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51502kb.class});
            case 3:
                return new C51504kd();
            case 4:
                return new C51503kc();
            case 5:
                return f134182b;
            case 6:
                C63010eb ebVar = f134183c;
                if (ebVar == null) {
                    synchronized (C51504kd.class) {
                        ebVar = f134183c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134182b);
                            f134183c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
